package com.in28minutes.rest.webservices.restfulwebservices;

public class HelloWorldBean  {
	
	private String message;
	
	public HelloWorldBean (String message){
		this.message = message;
	}


	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + ", getMessage()=" + getMessage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
