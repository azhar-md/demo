package com.example.demo.exceptionhandle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CentralizedExceptionalHandling extends ResponseEntityExceptionHandler {

	

	@ExceptionHandler(UserAlreadyExistsException.class)
	public final ResponseEntity<Object> handleUserAlreadyExistsException(Exception ex, WebRequest request)
			throws Exception {

		List<String> details = new ArrayList<>();
		details.add(ex.getLocalizedMessage());
		ErrorResponse error = new ErrorResponse("User Already exists", details);
		return new ResponseEntity(error, HttpStatus.BAD_REQUEST);

	}
	
	
	/*
	 * @ExceptionHandler(Exception.class) public final ResponseEntity<Object>
	 * handleAllException(Exception ex, WebRequest request) throws Exception {
	 * 
	 * List<String> details = new ArrayList<>();
	 * details.add(ex.getLocalizedMessage()); ErrorResponse error = new
	 * ErrorResponse("Server Error", details); return new ResponseEntity(error,
	 * HttpStatus.INTERNAL_SERVER_ERROR);
	 * 
	 * }
	 */

}
