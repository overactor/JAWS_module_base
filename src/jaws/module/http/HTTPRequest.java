package jaws.module.http;

/**
 * An interface to represent an HTTP request to the webserver.
 * 
 * @author Rik
 * 
 * @see jaws.module.http.HTTPResponse
 */
public interface HTTPRequest extends HTTPObject<HTTPRequest> {

	/**
	 * Sets the method of the HTTP Request.
	 * 
	 * @param method the method of the HTTP Request as an Enum.
	 * @return the HTTPRequest for method chaining.
	 */
	HTTPRequest method(RequestMethod method);
	
	/**
	 * Gets the method of the HTTP Request.
	 * 
	 * @return the method of the HTTP Request as an Enum.
	 */
	RequestMethod method();
	
	
	/**
	 * Sets the url of the HTTP Request.
	 * 
	 * @param url the url as a String.
	 * @return the HTTPRequest for method chaining.
	 */
	HTTPRequest url(String url);
	
	/**
	 * Gets the url of the HTTP Request.
	 * 
	 * @return the url as a String.
	 */
	String url();
	
	/**
	 * Sets the HTTP version of the HTTP Request.
	 * 
	 * @param httpVersion the HTTP version as a String.
	 * @return the HTTPRequest for method chaining.
	 */
	HTTPRequest httpVersion(String httpVersion);
	
	/**
	 * Gets the HTTP version of the HTTP Request.
	 * 
	 * @return the HTTP version as a String.
	 */
	String httpVersion();
}
