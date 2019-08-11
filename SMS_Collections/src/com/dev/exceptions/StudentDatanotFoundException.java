package com.dev.exceptions;

public class StudentDatanotFoundException extends RuntimeException{
	@Override
	public String getMessage()
	{
		return "data fetching is failed";
	} 


}
