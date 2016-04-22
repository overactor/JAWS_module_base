package jaws.module.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jaws.module.http.RequestMethod;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Handle {
	String[] extensions();
	int priority() default 0;
	RequestMethod[] methods() default {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.POST};
}
