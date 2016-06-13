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
	/**
	 * Returns the file extensions that the method can handle.
	 * 
	 * @return the file extensions that the method can handle.
	 */
	String[] extensions();
	
	/**
	 * Returns the priority of the handler.
	 * If multiple handlers exist with the same extension and request method, the higher specified priority will be used.
	 * 
	 * @return the priority of the handler.
	 */
	int priority() default 0;
	
	/**
	 * Returns the request methods that the method can handle.
	 * 
	 * @return the request methods that the method can handle.
	 */
	RequestMethod[] methods() default {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.POST};
}
