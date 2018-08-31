/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.openmessaging.internal;

import io.openmessaging.Error;
import io.openmessaging.exception.OMSRuntimeException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InternalErrorCodeTest {
    @Test
    public void generateInternalException() {
        OMSRuntimeException runtimeException = Error.generateException(Error.ERROR_10002, "1.1.0");
        assertThat(runtimeException.getErrorCode()).isEqualTo(Error.ERROR_10002.getErrorCode());
        assertThat(runtimeException.getMessage()).contains(String.format("The implementation version [%s] is illegal.", "1.1.0"));
    }

}