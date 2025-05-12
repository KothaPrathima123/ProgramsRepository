package com.pk.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ActorOperationsAdvice {
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegalAE(IllegalAccessException iae){
		return new ResponseEntity<String>(iae.getMessage(),HttpStatus.BAD_REQUEST);//we can also use BAD_GATEWAY
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAllExceptions(Exception e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
} 
