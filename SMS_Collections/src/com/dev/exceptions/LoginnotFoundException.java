package com.dev.exceptions;

public class LoginnotFoundException extends RuntimeException{
	@Override
	public String getMessage()
	{
		return "login credentials are incorrect";
	}

}
