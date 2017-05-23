package org.squirrelframework.foundation.fsm.builder;

import org.squirrelframework.foundation.fsm.StateMachine;
import org.squirrelframework.foundation.fsm.builder.*;

/**
 * Created by kailianghe on 7/12/14.
 */
public interface MultiFrom<T extends StateMachine<T, S, E, C>, S, E, C> {

    /**
     * Build transition target states and return to clause builder
     * @param stateIds id of states
     * @return To clause builder
     */
    org.squirrelframework.foundation.fsm.builder.MultiTo<T, S, E, C> toAmong(S... stateIds);
}
