package com.example.demo.service;

import java.util.List;

import com.example.demo.data.dto.AppUserDto;

public interface AppUserService {

	List<AppUserDto> getUsers();

	void insertUser(AppUserDto appUserDto);

}
