package com.axis.exception;

@SuppressWarnings("serial")
public class InvalidSalaryException extends RuntimeException {

	private String msg;

	public String getMsg() {
		return msg;
	}
	
	public InvalidSalaryException(String msg) {
		super();
		this.msg = msg;
	}
	
	
}
