package com.egemsoft.springboot.projedemo2.rest;

public class UserAlbumsErrorResponse {

	
	private int status;
	private String message;
	private long timeStamp;
	
	public UserAlbumsErrorResponse() {
		
		
	}

	public UserAlbumsErrorResponse(int status, String message, long timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
}
