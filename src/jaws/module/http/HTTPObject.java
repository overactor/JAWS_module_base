package jaws.module.http;

import java.io.ByteArrayOutputStream;

public interface HTTPObject<T extends HTTPObject<T>> {

	public T header(String key, String value);
	public String header(String key);
	public T body(byte[] body);
	public T body(String body);
	public byte[] body();
	public T body(ByteArrayOutputStream stream);
	public byte[] getBytes();
	public ByteArrayOutputStream getOutputStream();
}
