package com.rest.webservices.restfulwebservices;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String string) {
		this.message=string;
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}
	
}
