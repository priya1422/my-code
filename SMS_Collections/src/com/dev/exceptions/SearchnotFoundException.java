package com.dev.exceptions;

public class SearchnotFoundException extends RuntimeException{
	
		
		@Override
		public String getMessage() {
			return "searched details not found";
		}
	}	


