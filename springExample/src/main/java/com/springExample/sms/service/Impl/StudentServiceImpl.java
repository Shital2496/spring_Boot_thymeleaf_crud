package com.springExample.sms.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springExample.sms.entity.Student;
import com.springExample.sms.reposistory.StudentReposistory;
import com.springExample.sms.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	//dependency inject
	private StudentReposistory studentReposistory;
	
	//create constructor
	
	public StudentServiceImpl(StudentReposistory studentReposistory) {
		super();
		this.studentReposistory = studentReposistory;
	}
	
	
	@Override
	public List<Student> getAllStudents() {
		
		return studentReposistory.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentReposistory.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentReposistory.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentReposistory.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentReposistory.deleteById(id);
		
	}

	

}
