package jaws.module.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to specify that a class contains one or more methods annotated with {@link jaws.module.net.Handle}. Required for performance reasons.
 * 
 * @author Roy
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ContainsHandler {}
