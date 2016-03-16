package jaws.module.http;

public interface HTTPRequest extends HTTPObject<HTTPRequest> {

	HTTPRequest method(RequestMethod valueOf);
	RequestMethod method();
	HTTPRequest url(String string);
	String url();
	HTTPRequest httpVersion(String string);
	String httpVersion();
}
