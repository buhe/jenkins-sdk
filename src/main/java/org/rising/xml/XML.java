/**
 * Copyright (c) 2016, Istomin Andrei
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rising.xml;

import org.apache.commons.io.IOUtils;

/**
 * XML file.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 1.0
 */
public final class XML {

    /**
     * File name.
     */
    private final transient String name;

    /**
     * Ctor.
     * @param file File name.
     */
    public XML(final String file) {
        this.name = file;
    }

    /**
     * XML string content.
     * @return XML string.
     * @throws Exception If reading XML was not successful.
     */
    public String content() throws Exception {
        return IOUtils.toString(
            Thread.currentThread().getContextClassLoader()
                .getResourceAsStream(this.name)
        );
    }
}