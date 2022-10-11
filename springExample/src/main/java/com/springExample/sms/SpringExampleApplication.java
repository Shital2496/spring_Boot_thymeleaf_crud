package com.springExample.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springExample.sms.entity.Student;
import com.springExample.sms.reposistory.StudentReposistory;

@SpringBootApplication
public class SpringExampleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
		
		System.out.println("RUNNING....");
	}
	
	@Autowired
	private StudentReposistory studentReposistory;

	@Override
	public void run(String... args) throws Exception {
//		Student student1= new Student("aaa","aaa@gmail.com");
//		studentReposistory.save(student1);
//		
//		Student student2= new Student("bbb","bbb@gmail.com");
//		studentReposistory.save(student2);
//		
//		Student student3= new Student("ccc","ccc@gmail.com");
//		studentReposistory.save(student3);
		
	}

}
