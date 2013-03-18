package org.ingini.akka.blocking.message;

import javax.annotation.concurrent.Immutable;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2013 Ivan Hristov
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@Immutable
public class BusinessMessagesHolder {
    private final List<BusinessMessage> businessMessages;

    public BusinessMessagesHolder(List<BusinessMessage> businessMessages) {
        this.businessMessages = new ArrayList<BusinessMessage>(businessMessages);
    }

    public List<BusinessMessage> getBusinessMessages() {
        return businessMessages;
    }
}
