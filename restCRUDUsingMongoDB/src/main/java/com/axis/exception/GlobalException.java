//package com.axis.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@SuppressWarnings("serial")
//@RestControllerAdvice
//public class GlobalException extends RuntimeException {
//	
//	@ExceptionHandler(IdNotFoundException.class)
//	ResponseEntity<String>myException(IdNotFoundException exception){
//		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
//			
//	}
//	
//	@ExceptionHandler(InvalidAgeException.class)
//	ResponseEntity<String>myException(InvalidAgeException exception){
//		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
//			
//	}
//
//}



package com.axis.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(IdNotFoundException.class)
	ResponseEntity<ErrorInfo> myIdException(IdNotFoundException exception)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(exception.getMsg());
		errorInfo.setStatus(HttpStatus.NOT_FOUND.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(InvalidAgeException.class)
	ResponseEntity<ErrorInfo> myAgeException(InvalidAgeException exception)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(exception.getMsg());
		errorInfo.setStatus(HttpStatus.BAD_REQUEST.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(InvalidSalaryException.class)
	ResponseEntity<ErrorInfo> myAgeException(InvalidSalaryException exception)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(exception.getMsg());
		errorInfo.setStatus(HttpStatus.BAD_REQUEST.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
	}
}

