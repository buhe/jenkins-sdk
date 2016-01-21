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

/**
 * Jenkins' users sample XML.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 1.0
 */
public final class SampleUsersXML {

    /**
     * XML file.
     */
    private final transient XML xml = new XML("users.xml");

    /**
     * XML string content.
     *
     * @return XML string.
     * @throws Exception If reading XML was not successful.
     */
    public String content() throws Exception {
        return this.xml.content();
    }
}