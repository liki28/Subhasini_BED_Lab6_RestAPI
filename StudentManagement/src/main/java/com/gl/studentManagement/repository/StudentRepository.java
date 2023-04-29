package com.gl.studentManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.studentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
}