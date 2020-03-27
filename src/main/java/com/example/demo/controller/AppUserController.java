package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.dto.AppUserDto;
import com.example.demo.data.dto.AppUsersDto;
import com.example.demo.serviceImpl.AppUserServiceImpl;

@RestController
@RequestMapping("/users")
public class AppUserController {

	@Autowired
	private AppUserServiceImpl appUserServiceImpl;

	@GetMapping
	public  AppUsersDto getUsers() {
		List<AppUserDto> appUserDtos =appUserServiceImpl.getUsers();
		AppUsersDto appUsersdtos = new AppUsersDto();
		appUsersdtos.setAppUsersDto(appUserDtos);
		return appUsersdtos;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void insertUser(@Validated @RequestBody AppUserDto appUserDto) {
		appUserServiceImpl.insertUser(appUserDto);

	}
	
	

}
