/*
*  Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.kernel.config;


import org.wso2.carbon.internal.kernel.config.model.CarbonConfiguration;

/**
 * CarbonConfigProvider allows CarbonRuntime implementations to retrieve a CarbonConfiguration instance.
 * CarbonConfiguration can be populated from different sources. For an example, from a file or from a URL. This class
 * provides a way abstract out the different sources and provide a generic interface to the CarbonRuntime implementers.
 *
 * @since 5.0.0
 */
public interface CarbonConfigProvider {

    /**
     * Returns a populated CarbonConfiguration instance
     *
     * @return a instance of the CarbonConfiguration
     */
    public CarbonConfiguration getCarbonConfiguration();

}