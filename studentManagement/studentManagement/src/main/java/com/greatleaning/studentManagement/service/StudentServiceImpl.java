package com.greatleaning.studentManagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatleaning.studentManagement.entity.Student;
import com.greatleaning.studentManagement.repository.StudentRepository;

@Repository
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	@Transactional
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	@Transactional
	public Student findById(int id) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student = studentRepository.findById(id).get();
		return student;
	}
	
	@Override
	@Transactional
	public void save(Student student) {
		// TODO Auto-generated method stub
		System.out.println("Student saved is" + student);
		studentRepository.save(student);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

}
