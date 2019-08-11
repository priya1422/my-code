package com.dev.exceptions;

public class EmailnotUpdatedException extends RuntimeException{
	@Override
	public String getMessage()
	{
		return "email updation failed";
	}

}
