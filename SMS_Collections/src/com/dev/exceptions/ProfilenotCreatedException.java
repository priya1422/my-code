package com.dev.exceptions;

public class ProfilenotCreatedException extends RuntimeException {
	@Override
	public String getMessage() {
		return "profile creation failed";
	}
	

}
