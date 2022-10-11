package com.springExample.sms.reposistory;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springExample.sms.entity.Student;

@Repository
public interface StudentReposistory  extends JpaRepository <Student, Long>{

}
