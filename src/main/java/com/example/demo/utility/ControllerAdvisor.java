package com.example.demo.utility;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String, String>> handleException(Exception ex){
		System.out.println("exception tripped");
		Map<String,String> body = new HashMap<>();
		body.put("message", ex.getMessage());
		System.out.println(ex.getMessage());
		//ex.printStackTrace();
		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}

}
