package jaws.module.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jaws.module.http.RequestMethod;

/**
 * An annotation to specify what types of requests a method can handle.
 * The class containing this method must be annotated with {@link jaws.module.net.ContainsHandler}.
 * 
 * @author Roy
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Handle {
	String[] extensions();
	int priority() default 0;
	RequestMethod[] methods() default {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.POST};
}
