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

import com.github.aistomin.jenkins.Job;
import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Integration tests for RealJobs class.
 *
 * @author Andrei Istomin (andrej.istomin.ikeen@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public final class ITRealJobsTest {

    /**
     * Can get jobs' XML.
     *
     * @throws Exception If something goes wrong.
     */
    @Test
    public void testCanReadXML() throws Exception {
        final String xml = new TestJenkins().jobs().xml();
        Assert.assertTrue(
            xml.contains("<displayName>test-different-builds-job</displayName>")
        );
        Assert.assertTrue(
            xml.contains("<displayName>test-disabled-job</displayName>")
        );
    }

    /**
     * Can iterate through Jenkins jobs.
     *
     * @throws Exception If something goes wrong.
     */
    @Test
    public void testCanIterateThroughJobs() throws Exception {
        final Iterator<Job> jobs = new TestJenkins().jobs().iterator();
        Assert.assertEquals("test-different-builds-job", jobs.next().name());
        Assert.assertEquals("test-disabled-job", jobs.next().name());
        Assert.assertEquals("test-parametrised-job", jobs.next().name());
    }
}
