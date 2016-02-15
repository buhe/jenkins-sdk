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
 * Jenkins' job build details like: display name, url, duration etc.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public interface BuildDetails {

    /**
     * Build's full display name.
     *
     * @return Full display name.
     * @throws Exception If error occurred.
     */
    String fullDisplayName() throws Exception;

    /**
     * Build's display name.
     *
     * @return Display name.
     * @throws Exception If error occurred.
     */
    String displayName() throws Exception;

    /**
     * Build's estimated duration in milliseconds.
     *
     * @return Build's estimated duration.
     * @throws Exception If error occurred.
     */
    Long estimated() throws Exception;

    /**
     * Build's duration in milliseconds.
     *
     * @return Build's duration.
     * @throws Exception If error occurred.
     */
    Long duration() throws Exception;

    /**
     * Is build in process?
     *
     * @return Is build in process?
     * @throws Exception If error occurred.
     */
    Boolean building() throws Exception;

    /**
     * Build's queue ID.
     *
     * @return Queue ID.
     * @throws Exception If error occurred.
     */
    Long queue() throws Exception;
}