package com.greatleaning.studentManagement.service;

import java.util.List;
import java.util.Optional;

import com.greatleaning.studentManagement.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(int id);

	public void save(Student student);

	public void deleteById(int id);

}
