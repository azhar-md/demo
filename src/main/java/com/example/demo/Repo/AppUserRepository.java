package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.dao.AppUserDao;

public interface AppUserRepository extends JpaRepository<AppUserDao, Integer> {

	Optional<AppUserDao> findByUserName(String userName);
}
