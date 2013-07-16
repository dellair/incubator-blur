package org.apache.blur.lucene.search;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.blur.analysis.FieldManager;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.search.MultiPhraseQuery;
import org.apache.lucene.search.PhraseQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.util.Version;

public class BlurQueryParser extends QueryParser {

  public static final String SUPER = "super";

  protected final Map<Query, String> _fieldNames;
  protected final FieldManager _fieldManager;

  public BlurQueryParser(Version matchVersion, String f, Map<Query, String> fieldNames, FieldManager fieldManager) {
    super(matchVersion, f, fieldManager.getAnalyzerForQuery());
    _fieldNames = fieldNames == null ? new HashMap<Query, String>() : fieldNames;
    _fieldManager = fieldManager;
  }

  @Override
  protected Query newFuzzyQuery(Term term, float minimumSimilarity, int prefixLength) {
    String field = term.field();
    try {
      if (!_fieldManager.checkSupportForFuzzyQuery(field)) {
        throw new RuntimeException("Field [" + field + "] is type [" + _fieldManager.getFieldTypeDefinition(field)
            + "] which does not support fuzzy queries.");
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return addField(super.newFuzzyQuery(term, minimumSimilarity, prefixLength), term.field());
  }

  @Override
  protected Query newMatchAllDocsQuery() {
    return addField(super.newMatchAllDocsQuery(), UUID.randomUUID().toString());
  }

  @Override
  protected MultiPhraseQuery newMultiPhraseQuery() {
    return new MultiPhraseQuery() {
      @Override
      public void add(Term[] terms, int position) {
        super.add(terms, position);
        for (Term term : terms) {
          addField(this, term.field());
        }
      }
    };
  }

  @Override
  protected PhraseQuery newPhraseQuery() {
    return new PhraseQuery() {

      @Override
      public void add(Term term, int position) {
        super.add(term, position);
        addField(this, term.field());
      }
    };
  }

  @Override
  protected Query newPrefixQuery(Term prefix) {
    String field = prefix.field();
    try {
      if (!_fieldManager.checkSupportForPrefixQuery(field)) {
        throw new RuntimeException("Field [" + field + "] is type [" + _fieldManager.getFieldTypeDefinition(field)
            + "] which does not support prefix queries.");
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return addField(super.newPrefixQuery(prefix), field);
  }

  @Override
  protected Query newRangeQuery(String field, String part1, String part2, boolean startInclusive, boolean endInclusive) {
    Query q;
    try {
      q = _fieldManager.getNewRangeQuery(field, part1, part2, startInclusive, endInclusive);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    if (q != null) {
      return addField(q, field);
    }
    return addField(super.newRangeQuery(field, part1, part2, startInclusive, endInclusive), field);
  }

  @Override
  protected Query newTermQuery(Term term) {
    String field = term.field();
    Query q;
    try {
      q = _fieldManager.getTermQueryIfNumeric(field, term.text());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    if (q != null) {
      return addField(q, field);
    }
    return addField(super.newTermQuery(term), field);
  }

  @Override
  protected Query newWildcardQuery(Term t) {
    if (SUPER.equals(t.field()) && "*".equals(t.text())) {
      return new MatchAllDocsQuery();
    }
    String field = t.field();
    try {
      if (!_fieldManager.checkSupportForWildcardQuery(field)) {
        throw new RuntimeException("Field [" + field + "] is type [" + _fieldManager.getFieldTypeDefinition(field)
            + "] which does not support wildcard queries.");
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return addField(super.newWildcardQuery(t), t.field());
  }

  private Query addField(Query q, String field) {
    _fieldNames.put(q, field);
    return q;
  }

}
