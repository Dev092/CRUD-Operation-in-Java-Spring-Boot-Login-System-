package com.kpit.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpit.login.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}