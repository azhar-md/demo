package com.example.demo.data.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppUserDto {

	private int serialNo;
	private String userName;
	private String occupation;
		
	public AppUserDto() {
		
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	
	

}
