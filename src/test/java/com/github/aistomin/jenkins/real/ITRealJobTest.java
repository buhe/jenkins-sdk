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

import com.github.aistomin.jenkins.JobDetails;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for RealJob.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public final class ITRealJobTest {

    /**
     * Can get job's XML.
     *
     * @throws Exception If something goes wrong.
     */
    @Test
    public void testCanReadXML() throws Exception {
        final String xml = new TestJenkins().jobs().iterator().next().xml();
        Assert.assertTrue(xml.startsWith("<job>"));
        Assert.assertTrue(
            xml.contains("<displayName>test-different-builds-job</displayName>")
        );
        Assert.assertTrue(xml.endsWith("</job>"));
    }

    /**
     * Can list job's builds.
     *
     * @throws Exception If something goes wrong.
     */
    @Test
    public void testCanListBuilds() throws Exception {
        Assert.assertNotNull(
            new TestJenkins().jobs().iterator().next().builds()
        );
    }

    /**
     * Can read job's details.
     *
     * @throws Exception If something goes wrong.
     */
    @Test
    public void testCanReadJobDetails() throws Exception {
        final JobDetails details = new TestJenkins().jobs().iterator().next()
            .details();
        Assert.assertEquals("test-different-builds-job", details.displayName());
        Assert.assertEquals(
            "This job we use for testing builds.", details.description()
        );
        Assert.assertTrue(details.buildable());
    }
}
