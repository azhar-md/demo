package com.example.demo.data.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "App_User")
public class AppUserDao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int serialNo;
	@javax.validation.constraints.NotEmpty(message = "UserName cannot be empty")
	private String userName;
	private String occupation;
	
	public AppUserDao(int serialNo, String userName, String occupation) {
		
		this.serialNo = serialNo;
		this.userName = userName;
		this.occupation = occupation;
	}
	public AppUserDao() {
		
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
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	
	
	

}
