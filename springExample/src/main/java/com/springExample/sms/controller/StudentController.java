package com.springExample.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springExample.sms.entity.Student;
import com.springExample.sms.reposistory.StudentReposistory;
import com.springExample.sms.service.StudentService;

@Controller

public class StudentController {

	@Autowired
	private StudentService studentService;

	
	//create default constructor
	public StudentController(StudentReposistory studentReposistory) {
		super();
		this.studentService = studentService;
	}
	
	
	//handle list students mode & view
	@GetMapping("/students")
	public String  listStudents(Model model)
	{
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
	
	
		//create object to hold data
		Student student =new Student();
		model.addAttribute("student", student);
		
		return "create_student";
		}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
		
	}
	
	
	//handle update code
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model)
	{
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, 
			@ModelAttribute("student") Student student ,
			Model model) 
	{
		
		Student existingStudent =studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setName(student.getName());
		existingStudent.setEmail(student.getEmail());
		
		
		//save updated student object
		
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	
	//handle student request
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id)
	{
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	
		
	}

	
	

