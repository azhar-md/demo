package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.AppUserRepository;
import com.example.demo.data.dao.AppUserDao;
import com.example.demo.data.dto.AppUserDto;
import com.example.demo.exceptionhandle.UserAlreadyExistsException;
import com.example.demo.service.AppUserService;

@RestController
public class AppUserServiceImpl implements AppUserService {

	@Autowired
	private AppUserRepository appUserRepository;

	@Override
	public List<AppUserDto> getUsers() {

		List<AppUserDao> appUserDaos = appUserRepository.findAll();

		//return appUserDaos.stream().map(this::getAppUserDto).collect(Collectors.toList());

		return appUserDaos.stream().map(e -> {
			AppUserDto appUserDto = new AppUserDto();
			appUserDto.setSerialNo(e.getSerialNo());
			appUserDto.setUserName(e.getUserName());
			appUserDto.setOccupation(e.getOccupation());
			return appUserDto;
		}).collect(Collectors.toList());

	}

	/*
	 * private AppUserDto getAppUserDto(AppUserDao appUserDao) { AppUserDto
	 * appUserDto = new AppUserDto();
	 * appUserDto.setSerialNo(appUserDao.getSerialNo());
	 * appUserDto.setUserName(appUserDao.getUserName());
	 * appUserDto.setOccupation(appUserDao.getOccupation());
	 * 
	 * return appUserDto;
	 * 
	 * }
	 */

	@Override
	public void insertUser(AppUserDto appUserDto) {
		Optional<AppUserDao> appOptional = appUserRepository.findByUserName(appUserDto.getUserName());

		// boolean flag = true;

		if (appOptional.isPresent()) {
			// System.out.println("User already exists");
			System.out.println("The Value is true");
			throw new UserAlreadyExistsException("User already exists in database server");
		} else {
			System.out.println("The Value is false");
			AppUserDao appUserDao2 = new AppUserDao();
			appUserDao2.setUserName(appUserDto.getUserName());
			appUserDao2.setOccupation(appUserDto.getOccupation());

			appUserRepository.save(appUserDao2);

		}

	}

}
