package jaws.module.http;

import java.io.ByteArrayOutputStream;

/**
 * An interface to represent both http responses and requests.
 *
 * @author Rik
 *
 * @param <T> used to make method chaining possible for inheriting interfaces, should be identical to the inheriting interface.
 * 
 * @see jaws.module.http.HTTPRequest
 * @see jaws.module.http.HTTPResponse
 */
public interface HTTPObject<T extends HTTPObject<T>> {

	/**
	 * Sets the header for the key to the value.
	 *
	 * @param key the header key.
	 * @param value the value of the header field.
	 * @return the HTTP object for method chaining.
	 */
	public T header(String key, String value);

	/**
	 * Gets the value of a header field for a key.
	 *
	 * @param key the key of the header field.
	 * @return the value of the field.
	 */
	public String header(String key);

	/**
	 * Sets the body of the HTTP object.
	 *
	 * @param body the body of the HTTP object as a byte array.
	 * @return the HTTP object for method chaining.
	 */
	public T body(byte[] body);

	/**
	 * Sets the body of the HTTP object.
	 *
	 * @param body the body of the HTTP object as a string.
	 * @return the HTTP object for method chaining.
	 */
	public T body(String body);

	/**
	 * Gets the body of the HTTP object.
	 *
	 * @return the body of the HTTP object as a byte array.
	 */
	public byte[] body();

	/**
	 * Sets the body of the HTTP object directly as a ByteArrayOutputStream.
	 *
	 * @param stream the stream to set the body to.
	 * @return the body of the HTTP object as a byte array.
	 */
	public T body(ByteArrayOutputStream stream);

	/**
	 * Returns a representation of the HTTP object as a byte array suitable for sending over a socket.
	 *
	 * @return the byte array.
	 */
	public byte[] getBytes();

	/**
	 * Returns a representation of the HTTP object as a byte array stream suitable for sending over a socket.
	 *
	 * @return the stream.
	 */
	public ByteArrayOutputStream getOutputStream();
}
