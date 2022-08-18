package com.susgain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Globalexception {
	
	@ExceptionHandler
	public ResponseEntity<ErorrObject> handle(ValidationException ex){
		ErorrObject eb = new ErorrObject ();
		eb.setMessage(ex.getMessage());
		eb.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		eb.setTimestamp(System.currentTimeMillis());
		return  new ResponseEntity<>(eb, HttpStatus.NOT_FOUND);
	}

}
