package com.axis.exception;

@SuppressWarnings("serial")
public class IdNotFoundException extends RuntimeException{

	private String msg;

	public String getMsg() {
		return msg;
	}

	public IdNotFoundException(String msg) {
		this.msg = msg;
	}
}
