package com.greatleaning.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatleaning.studentManagement.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Integer> {

	
	
}
