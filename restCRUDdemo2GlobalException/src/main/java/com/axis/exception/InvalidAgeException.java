package com.axis.exception;

@SuppressWarnings("serial")
public class InvalidAgeException extends RuntimeException {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public InvalidAgeException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
}
