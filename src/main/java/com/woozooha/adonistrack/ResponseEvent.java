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
package com.woozooha.adonistrack;

import javax.servlet.http.HttpServletResponse;

public class ResponseEvent extends Event {

    public ResponseEvent() {
    }

    public ResponseEvent(HttpServletResponse response) {
        super(response);
    }

    @Override
    public String toString() {
        HttpServletResponse response = (HttpServletResponse) value;

        StringBuilder builder = new StringBuilder();

        int status = response.getStatus();
        builder.append(status);

        return builder.toString();
    }

}
