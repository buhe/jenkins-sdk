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
package com.github.aistomin.jenkins.real;

import com.github.aistomin.jenkins.BuildDetails;
import com.github.aistomin.xml.XML;

/**
 * Jenkins' job build details like: display name, url, duration etc.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public final class RealBuildDetails implements BuildDetails {

    /**
     * XML content of build details.
     */
    private final transient XML content;

    /**
     * Ctor.
     *
     * @param xml XML content of build details.
     */
    public RealBuildDetails(final XML xml) {
        this.content = xml;
    }

    /**
     * Build's full display name.
     *
     * @return Full display name.
     * @throws Exception If error occurred.
     */
    public String fullDisplayName() throws Exception {
        return this.content.field("//build/fullDisplayName/text()");
    }

    /**
     * Build's display name.
     *
     * @return Display name.
     * @throws Exception If error occurred.
     */
    public String displayName() throws Exception {
        return this.content.field("//build/displayName/text()");
    }

    /**
     * Build's estimated duration in milliseconds.
     *
     * @return Build's estimated duration.
     * @throws Exception If error occurred.
     */
    public Long estimated() throws Exception {
        return Long.parseLong(
            this.content.field("//build/estimatedDuration/text()")
        );
    }

    /**
     * Build's duration in milliseconds.
     *
     * @return Build's duration.
     * @throws Exception If error occurred.
     */
    public Long duration() throws Exception {
        return Long.parseLong(this.content.field("//build/duration/text()"));
    }

    /**
     * Is build in process?
     *
     * @return Is build in process?
     * @throws Exception If error occurred.
     */
    public Boolean building() throws Exception {
        return Boolean.parseBoolean(
            this.content.field("//build/building/text()")
        );
    }

    /**
     * Build's queue ID.
     *
     * @return Queue ID.
     * @throws Exception If error occurred.
     */
    public Long queue() throws Exception {
        return Long.parseLong(this.content.field("//build/queueId/text()"));
    }
}