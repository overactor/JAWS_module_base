package jaws.module.http;

public interface HTTPResponse extends HTTPObject<HTTPResponse> {

	public HTTPResponse statusCode(int i);
	public int statusCode();
	public HTTPResponse reason(String string);
	public String reason();
}
