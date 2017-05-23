/*
 *
 *
 *  * Copyright (c) 2017 Leo Lee(lichl.1980@163.com).
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  * use this file except in compliance with the License. You may obtain a copy
 *  * of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations
 *  * under the License.
 *  *
 *
 */

package com.xt.landlords.quark.components;

import com.xt.landlords.quark.DefaultFlow;
import com.xt.landlords.quark.quark.BetQuarkComponent;
import org.springframework.stereotype.Component;
import org.sunyata.quark.DefaultOrchestration;
import org.sunyata.quark.basic.AbstractBusinessComponent;
import org.sunyata.quark.basic.Orchestration;
import org.sunyata.quark.descriptor.QuarkComponentDescriptorFactory;
import org.sunyata.quark.executor.DefaultExecutor;
import org.sunyata.quark.stereotype.BusinessComponent;

/**
 * Created by leo on 16/12/15.
 */
@Component
@BusinessComponent(businName = "landlords-common-bet-component", bisinFriendlyName = "下注", version = "1.0",
        description = "desc", compensationSwitch = false)
public class BetBusinessComponent extends AbstractBusinessComponent<DefaultFlow, DefaultExecutor> {


    @Override
    public DefaultExecutor initializeExecutor() {
        return new DefaultExecutor();
    }

    @Override
    public DefaultFlow initializeFlow() throws Exception {
        Orchestration<DefaultFlow> orchestration =
                new DefaultOrchestration<DefaultFlow>()
                        .beginWith(QuarkComponentDescriptorFactory.getDescriptor(BetQuarkComponent.class))
                        .setBusinessComponentDescriptor(this.initializeDescriptor());

        return orchestration.orchestrate(DefaultFlow.class);
    }
}


