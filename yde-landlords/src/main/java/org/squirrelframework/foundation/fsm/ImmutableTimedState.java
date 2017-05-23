package org.squirrelframework.foundation.fsm;

public interface ImmutableTimedState<T extends org.squirrelframework.foundation.fsm.StateMachine<T, S, E, C>, S, E, C> extends ImmutableState<T, S, E, C> {
    
    long getTimeInterval();
    
    long getInitialDelay();
    
    E getAutoFireEvent();
    
    C getAutoFireContext();

}
