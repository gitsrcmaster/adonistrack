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
package com.woozooha.adonistrack.writer;

import com.woozooha.adonistrack.domain.Invocation;
import com.woozooha.adonistrack.format.Format;

/**
 * Writer do nothing.
 * 
 * @author woozoo73
 */
public class NullWriter implements Writer {

    @Override
    public Format getFormat() {
        return null;
    }

    @Override
    public void setFormat(Format format) {
        // do nothing.
    }

    @Override
    public void write(Invocation invocation) {
        // do nothing.
    }

}
