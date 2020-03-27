package com.example.demo.exceptionhandle;

public class ResponseEntityDuplicate {
	
	private int errorCode;
	private String errorMessage;
	private String suggestions;
	
	
	public ResponseEntityDuplicate() {
		
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	
	

}
