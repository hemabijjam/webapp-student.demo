package com.in.hema.jpa.bijjam.h2db.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.hema.jpa.bijjam.h2db.demo.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	

}
