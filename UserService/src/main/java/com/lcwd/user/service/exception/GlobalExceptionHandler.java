package com.lcwd.user.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lcwd.user.service.payLoad.ApiReposetory;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiReposetory> handlerResourceNotFoundException(ResourceNotFoundException ex){
		
		String message = ex.getMessage();
		ApiReposetory apiReposetory = ApiReposetory.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ApiReposetory>(apiReposetory, HttpStatus.NOT_IMPLEMENTED);
	}

}
