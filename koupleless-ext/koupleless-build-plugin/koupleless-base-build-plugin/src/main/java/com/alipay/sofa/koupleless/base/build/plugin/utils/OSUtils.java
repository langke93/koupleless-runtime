/*
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
package com.alipay.sofa.koupleless.base.build.plugin.utils;

/**
 * @author lianglipeng.llp@alibaba-inc.com
 * @version $Id: OSUtils.java, v 0.1 2024年06月27日 20:34 立蓬 Exp $
 */
public class OSUtils {
    static String OS_NAME_KEY = "os.name"; // 操作系统名称。

    /**
     * 获取本地文件协议前缀。
     *
     * @return 本地文件协议前缀。
     */
    public static String getLocalFileProtocolPrefix() {
        String os = System.getProperty(OS_NAME_KEY);
        if (os.toLowerCase().startsWith("win")) {
            return "file:///";
        } else {
            return "file://";
        }
    }
}