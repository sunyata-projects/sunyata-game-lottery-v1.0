package org.squirrelframework.foundation.fsm.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE})
@Retention(RUNTIME)
public @interface States {
    /** (Required) An array of <code>State</code> annotations. */
    org.squirrelframework.foundation.fsm.annotation.State[] value();
}
