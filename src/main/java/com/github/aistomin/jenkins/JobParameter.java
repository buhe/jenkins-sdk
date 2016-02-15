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
package com.github.aistomin.jenkins;

/**
 * Jenkins job parameter.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public interface JobParameter {

    /**
     * Parameter's name.
     *
     * @return Parameter's name.
     * @throws Exception If error occurred.
     */
    String name() throws Exception;

    /**
     * Parameter's type.
     *
     * @return Parameter's type.
     * @throws Exception If error occurred.
     */
    String type() throws Exception;

    /**
     * Parameter's description.
     *
     * @return Parameter's description.
     * @throws Exception If error occurred.
     */
    String description() throws Exception;
}
