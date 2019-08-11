package com.dev.exceptions;

public class DeleteStudentException extends RuntimeException{
	@Override
	public String getMessage()
	{
		return "data deletion failed";
	} 

}
