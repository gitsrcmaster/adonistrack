/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.woozooha.adonistrack.domain;

import javax.servlet.http.HttpServletResponse;

public class ResponseEvent extends Event<HttpServletResponse> {

    protected String type = "RESPONSE";

    public ResponseEvent() {
    }

    public ResponseEvent(HttpServletResponse response) {
        super(response);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append(type);
        builder.append("]");
        builder.append(" ");

        int status = value.getStatus();

        builder.append(status);

        return builder.toString();
    }

}
