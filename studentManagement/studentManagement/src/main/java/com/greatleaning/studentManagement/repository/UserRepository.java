package com.greatleaning.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatleaning.studentManagement.entity.*;

public interface UserRepository extends JpaRepository<User, Long> {

	//from Classname
	@Query("select u from User u where u.username=?1")
	public User getUserByUsername(String username); //class variable
	
}
