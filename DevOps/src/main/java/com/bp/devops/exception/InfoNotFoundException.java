package com.bp.devops.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class InfoNotFoundException extends RuntimeException {
	public InfoNotFoundException(String message) {
		super("ERROR");
	}
}
