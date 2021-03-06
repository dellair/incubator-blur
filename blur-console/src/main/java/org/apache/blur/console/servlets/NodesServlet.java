package org.apache.blur.console.servlets;

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

import org.apache.blur.console.model.User;
import org.apache.blur.console.util.HttpUtil;
import org.apache.blur.console.util.NodeUtil;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class NodesServlet extends BaseConsoleServlet {
  private static final long serialVersionUID = 6522056391102413432L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String path = req.getPathInfo();
    if (path == null) {
      sendNodeStatus(req, res);
    } else {
      sendNotFound(res, req.getRequestURI());
    }
  }

  private void sendNodeStatus(HttpServletRequest request, HttpServletResponse response) throws IOException {
    Map<String, Object> nodeData = new HashMap<String, Object>();

    try {
      nodeData.put("zookeepers", NodeUtil.getZookeeperStatus());
      nodeData.put("controllers", NodeUtil.getControllerStatus());
      nodeData.put("clusters", NodeUtil.getClusterStatus());
    } catch (IOException e) {
      throw new IOException(e);
    } catch (Exception e) {
      sendError(response, e);
      return;
    }

    HttpUtil.sendResponse(response, new ObjectMapper().writeValueAsString(nodeData), HttpUtil.JSON);
  }
}
