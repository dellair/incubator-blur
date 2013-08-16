/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.blur.thrift.generated;

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



import org.apache.blur.thirdparty.thrift_0_9_0.scheme.IScheme;
import org.apache.blur.thirdparty.thrift_0_9_0.scheme.SchemeFactory;
import org.apache.blur.thirdparty.thrift_0_9_0.scheme.StandardScheme;

import org.apache.blur.thirdparty.thrift_0_9_0.scheme.TupleScheme;
import org.apache.blur.thirdparty.thrift_0_9_0.protocol.TTupleProtocol;
import org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocolException;
import org.apache.blur.thirdparty.thrift_0_9_0.EncodingUtils;
import org.apache.blur.thirdparty.thrift_0_9_0.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * TableStats holds the statistics for a given table.
 */
public class TableStats implements org.apache.blur.thirdparty.thrift_0_9_0.TBase<TableStats, TableStats._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.blur.thirdparty.thrift_0_9_0.protocol.TStruct STRUCT_DESC = new org.apache.blur.thirdparty.thrift_0_9_0.protocol.TStruct("TableStats");

  private static final org.apache.blur.thirdparty.thrift_0_9_0.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.blur.thirdparty.thrift_0_9_0.protocol.TField("tableName", org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.STRING, (short)1);
  private static final org.apache.blur.thirdparty.thrift_0_9_0.protocol.TField BYTES_FIELD_DESC = new org.apache.blur.thirdparty.thrift_0_9_0.protocol.TField("bytes", org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.I64, (short)2);
  private static final org.apache.blur.thirdparty.thrift_0_9_0.protocol.TField RECORD_COUNT_FIELD_DESC = new org.apache.blur.thirdparty.thrift_0_9_0.protocol.TField("recordCount", org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.I64, (short)3);
  private static final org.apache.blur.thirdparty.thrift_0_9_0.protocol.TField ROW_COUNT_FIELD_DESC = new org.apache.blur.thirdparty.thrift_0_9_0.protocol.TField("rowCount", org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableStatsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableStatsTupleSchemeFactory());
  }

  /**
   * The table name.
   */
  public String tableName; // required
  /**
   * The size in bytes.
   */
  public long bytes; // required
  /**
   * The record count.
   */
  public long recordCount; // required
  /**
   * The row count.
   */
  public long rowCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.blur.thirdparty.thrift_0_9_0.TFieldIdEnum {
    /**
     * The table name.
     */
    TABLE_NAME((short)1, "tableName"),
    /**
     * The size in bytes.
     */
    BYTES((short)2, "bytes"),
    /**
     * The record count.
     */
    RECORD_COUNT((short)3, "recordCount"),
    /**
     * The row count.
     */
    ROW_COUNT((short)4, "rowCount");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // BYTES
          return BYTES;
        case 3: // RECORD_COUNT
          return RECORD_COUNT;
        case 4: // ROW_COUNT
          return ROW_COUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BYTES_ISSET_ID = 0;
  private static final int __RECORDCOUNT_ISSET_ID = 1;
  private static final int __ROWCOUNT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldMetaData("tableName", org.apache.blur.thirdparty.thrift_0_9_0.TFieldRequirementType.DEFAULT, 
        new org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldValueMetaData(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.STRING)));
    tmpMap.put(_Fields.BYTES, new org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldMetaData("bytes", org.apache.blur.thirdparty.thrift_0_9_0.TFieldRequirementType.DEFAULT, 
        new org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldValueMetaData(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.I64)));
    tmpMap.put(_Fields.RECORD_COUNT, new org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldMetaData("recordCount", org.apache.blur.thirdparty.thrift_0_9_0.TFieldRequirementType.DEFAULT, 
        new org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldValueMetaData(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.I64)));
    tmpMap.put(_Fields.ROW_COUNT, new org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldMetaData("rowCount", org.apache.blur.thirdparty.thrift_0_9_0.TFieldRequirementType.DEFAULT, 
        new org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldValueMetaData(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.blur.thirdparty.thrift_0_9_0.meta_data.FieldMetaData.addStructMetaDataMap(TableStats.class, metaDataMap);
  }

  public TableStats() {
  }

  public TableStats(
    String tableName,
    long bytes,
    long recordCount,
    long rowCount)
  {
    this();
    this.tableName = tableName;
    this.bytes = bytes;
    setBytesIsSet(true);
    this.recordCount = recordCount;
    setRecordCountIsSet(true);
    this.rowCount = rowCount;
    setRowCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableStats(TableStats other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    this.bytes = other.bytes;
    this.recordCount = other.recordCount;
    this.rowCount = other.rowCount;
  }

  public TableStats deepCopy() {
    return new TableStats(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    setBytesIsSet(false);
    this.bytes = 0;
    setRecordCountIsSet(false);
    this.recordCount = 0;
    setRowCountIsSet(false);
    this.rowCount = 0;
  }

  /**
   * The table name.
   */
  public String getTableName() {
    return this.tableName;
  }

  /**
   * The table name.
   */
  public TableStats setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  /**
   * The size in bytes.
   */
  public long getBytes() {
    return this.bytes;
  }

  /**
   * The size in bytes.
   */
  public TableStats setBytes(long bytes) {
    this.bytes = bytes;
    setBytesIsSet(true);
    return this;
  }

  public void unsetBytes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BYTES_ISSET_ID);
  }

  /** Returns true if field bytes is set (has been assigned a value) and false otherwise */
  public boolean isSetBytes() {
    return EncodingUtils.testBit(__isset_bitfield, __BYTES_ISSET_ID);
  }

  public void setBytesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BYTES_ISSET_ID, value);
  }

  /**
   * The record count.
   */
  public long getRecordCount() {
    return this.recordCount;
  }

  /**
   * The record count.
   */
  public TableStats setRecordCount(long recordCount) {
    this.recordCount = recordCount;
    setRecordCountIsSet(true);
    return this;
  }

  public void unsetRecordCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RECORDCOUNT_ISSET_ID);
  }

  /** Returns true if field recordCount is set (has been assigned a value) and false otherwise */
  public boolean isSetRecordCount() {
    return EncodingUtils.testBit(__isset_bitfield, __RECORDCOUNT_ISSET_ID);
  }

  public void setRecordCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RECORDCOUNT_ISSET_ID, value);
  }

  /**
   * The row count.
   */
  public long getRowCount() {
    return this.rowCount;
  }

  /**
   * The row count.
   */
  public TableStats setRowCount(long rowCount) {
    this.rowCount = rowCount;
    setRowCountIsSet(true);
    return this;
  }

  public void unsetRowCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROWCOUNT_ISSET_ID);
  }

  /** Returns true if field rowCount is set (has been assigned a value) and false otherwise */
  public boolean isSetRowCount() {
    return EncodingUtils.testBit(__isset_bitfield, __ROWCOUNT_ISSET_ID);
  }

  public void setRowCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROWCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case BYTES:
      if (value == null) {
        unsetBytes();
      } else {
        setBytes((Long)value);
      }
      break;

    case RECORD_COUNT:
      if (value == null) {
        unsetRecordCount();
      } else {
        setRecordCount((Long)value);
      }
      break;

    case ROW_COUNT:
      if (value == null) {
        unsetRowCount();
      } else {
        setRowCount((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case BYTES:
      return Long.valueOf(getBytes());

    case RECORD_COUNT:
      return Long.valueOf(getRecordCount());

    case ROW_COUNT:
      return Long.valueOf(getRowCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case BYTES:
      return isSetBytes();
    case RECORD_COUNT:
      return isSetRecordCount();
    case ROW_COUNT:
      return isSetRowCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableStats)
      return this.equals((TableStats)that);
    return false;
  }

  public boolean equals(TableStats that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_bytes = true;
    boolean that_present_bytes = true;
    if (this_present_bytes || that_present_bytes) {
      if (!(this_present_bytes && that_present_bytes))
        return false;
      if (this.bytes != that.bytes)
        return false;
    }

    boolean this_present_recordCount = true;
    boolean that_present_recordCount = true;
    if (this_present_recordCount || that_present_recordCount) {
      if (!(this_present_recordCount && that_present_recordCount))
        return false;
      if (this.recordCount != that.recordCount)
        return false;
    }

    boolean this_present_rowCount = true;
    boolean that_present_rowCount = true;
    if (this_present_rowCount || that_present_rowCount) {
      if (!(this_present_rowCount && that_present_rowCount))
        return false;
      if (this.rowCount != that.rowCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TableStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TableStats typedOther = (TableStats)other;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(typedOther.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.blur.thirdparty.thrift_0_9_0.TBaseHelper.compareTo(this.tableName, typedOther.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBytes()).compareTo(typedOther.isSetBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBytes()) {
      lastComparison = org.apache.blur.thirdparty.thrift_0_9_0.TBaseHelper.compareTo(this.bytes, typedOther.bytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecordCount()).compareTo(typedOther.isSetRecordCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecordCount()) {
      lastComparison = org.apache.blur.thirdparty.thrift_0_9_0.TBaseHelper.compareTo(this.recordCount, typedOther.recordCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowCount()).compareTo(typedOther.isSetRowCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowCount()) {
      lastComparison = org.apache.blur.thirdparty.thrift_0_9_0.TBaseHelper.compareTo(this.rowCount, typedOther.rowCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocol iprot) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocol oprot) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TableStats(");
    boolean first = true;

    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      sb.append(this.tableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bytes:");
    sb.append(this.bytes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("recordCount:");
    sb.append(this.recordCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rowCount:");
    sb.append(this.rowCount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.blur.thirdparty.thrift_0_9_0.protocol.TCompactProtocol(new org.apache.blur.thirdparty.thrift_0_9_0.transport.TIOStreamTransport(out)));
    } catch (org.apache.blur.thirdparty.thrift_0_9_0.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.blur.thirdparty.thrift_0_9_0.protocol.TCompactProtocol(new org.apache.blur.thirdparty.thrift_0_9_0.transport.TIOStreamTransport(in)));
    } catch (org.apache.blur.thirdparty.thrift_0_9_0.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TableStatsStandardSchemeFactory implements SchemeFactory {
    public TableStatsStandardScheme getScheme() {
      return new TableStatsStandardScheme();
    }
  }

  private static class TableStatsStandardScheme extends StandardScheme<TableStats> {

    public void read(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocol iprot, TableStats struct) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
      org.apache.blur.thirdparty.thrift_0_9_0.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BYTES
            if (schemeField.type == org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.I64) {
              struct.bytes = iprot.readI64();
              struct.setBytesIsSet(true);
            } else { 
              org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RECORD_COUNT
            if (schemeField.type == org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.I64) {
              struct.recordCount = iprot.readI64();
              struct.setRecordCountIsSet(true);
            } else { 
              org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROW_COUNT
            if (schemeField.type == org.apache.blur.thirdparty.thrift_0_9_0.protocol.TType.I64) {
              struct.rowCount = iprot.readI64();
              struct.setRowCountIsSet(true);
            } else { 
              org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocol oprot, TableStats struct) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.tableName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(BYTES_FIELD_DESC);
      oprot.writeI64(struct.bytes);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECORD_COUNT_FIELD_DESC);
      oprot.writeI64(struct.recordCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ROW_COUNT_FIELD_DESC);
      oprot.writeI64(struct.rowCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableStatsTupleSchemeFactory implements SchemeFactory {
    public TableStatsTupleScheme getScheme() {
      return new TableStatsTupleScheme();
    }
  }

  private static class TableStatsTupleScheme extends TupleScheme<TableStats> {

    @Override
    public void write(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocol prot, TableStats struct) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetBytes()) {
        optionals.set(1);
      }
      if (struct.isSetRecordCount()) {
        optionals.set(2);
      }
      if (struct.isSetRowCount()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetBytes()) {
        oprot.writeI64(struct.bytes);
      }
      if (struct.isSetRecordCount()) {
        oprot.writeI64(struct.recordCount);
      }
      if (struct.isSetRowCount()) {
        oprot.writeI64(struct.rowCount);
      }
    }

    @Override
    public void read(org.apache.blur.thirdparty.thrift_0_9_0.protocol.TProtocol prot, TableStats struct) throws org.apache.blur.thirdparty.thrift_0_9_0.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bytes = iprot.readI64();
        struct.setBytesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.recordCount = iprot.readI64();
        struct.setRecordCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.rowCount = iprot.readI64();
        struct.setRowCountIsSet(true);
      }
    }
  }

}

