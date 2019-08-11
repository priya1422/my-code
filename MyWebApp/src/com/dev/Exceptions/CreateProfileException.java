package com.dev.Exceptions;

public class CreateProfileException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Profile Creation Failed";
	}
}