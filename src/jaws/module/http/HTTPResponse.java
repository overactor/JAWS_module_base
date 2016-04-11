package jaws.module.http;

/**
 * An interface to represent an HTTP response from the webserver.
 * 
 * @author Rik
 * 
 * @see jaws.module.http.HTTPRequest
 */
public interface HTTPResponse extends HTTPObject<HTTPResponse> {

	/**
	 * Sets the status code of the HTTP response.
	 * 
	 * @param code the status code as an integer.
	 * @return the HTTPResponse for method chaining.
	 */
	public HTTPResponse statusCode(int code);
	
	/**
	 * Gets the status code of the HTTP response.
	 * 
	 * @return the status code as an integer.
	 */
	public int statusCode();
	
	/**
	 * Sets the reason of the HTTP response.
	 * 
	 * @param reason the reason of the HTTP response.
	 * @return the HTTPResopnse for method chaining.
	 */
	public HTTPResponse reason(String reason);
	
	/**
	 * Gets the reason of the HTTP response. 
	 * 
	 * @return the reason as a String.
	 */
	public String reason();

	/**
	 * Gets the HTTP version of the HTTP Response.
	 * 
	 * @return the HTTP version as a String.
	 */
	public String httpVersion();

	/**
	 * Sets the HTTP version of the HTTP Response.
	 * 
	 * @param httpVersion the HTTP version as a String.
	 * @return the HTTPResponse for method chaining.
	 */
	public HTTPResponse httpVersion(String httpVersion);
}
