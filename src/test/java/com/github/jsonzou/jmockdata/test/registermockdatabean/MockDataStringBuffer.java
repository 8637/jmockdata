/**
 * Copyright © 2017 jsonzou (keko-boy@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jsonzou.jmockdata.test.registermockdatabean;

import com.github.jsonzou.jmockdata.mockdata.JMockDataManager;
import com.github.jsonzou.jmockdata.mockdata.JmockDataContext;
import com.github.jsonzou.jmockdata.mockdata.MockData;
import com.github.jsonzou.jmockdata.mockdata.constants.MockType;
import com.github.jsonzou.jmockdata.utils.RandomUtil;

/**
 *  mock the StringBuffer data
 * Created by jsonzou on 2016/12/16.
 */
public class MockDataStringBuffer implements MockData<StringBuffer> {
    public StringBuffer mock(JmockDataContext context) {
        StringBuffer sb = new StringBuffer();
        int len= RandomUtil.randomIntegerNotZero(50);
        for (int i=0;i<len;i++){
            sb.append(JMockDataManager.getInstance().getMockDataBean(Character.class).mock(context));
        }
        return sb;
    }
    public MockType mockType() {
        return MockType.STRING;
    }
}
