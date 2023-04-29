package com.gl.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.studentManagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);

}

