package com.in.hema.jpa.bijjam.h2db.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.hema.jpa.bijjam.h2db.demo.entity.Student;
import com.in.hema.jpa.bijjam.h2db.demo.json.StudentRequest;
import com.in.hema.jpa.bijjam.h2db.demo.json.StudentResponse;
import com.in.hema.jpa.bijjam.h2db.demo.repository.StudentRepository;

@RestController
@RequestMapping("students")
public class StudentController {
	private final StudentRepository studentRepository;

	public StudentController(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	@PostMapping
	public StudentResponse save(@RequestBody StudentRequest studentRequest) {
		final Student student=toStudent(studentRequest);
		Student savedStudent = studentRepository.save(student);
		final StudentResponse studentResponse=toStudentResponse(savedStudent);
		return studentResponse;
	}
	@PutMapping("{id}")
	public StudentResponse update(@PathVariable Integer Id,@RequestBody StudentRequest studentRequest) {
		final Student student=toStudent(studentRequest);
		student.setId(Id);
		Student savedStudent = studentRepository.save(student);
		final StudentResponse studentResponse=toStudentResponse(savedStudent);
		return studentResponse;
	}
	private static final StudentResponse toStudentResponse(Student student) {
		final StudentResponse studentResponse=new StudentResponse();
		studentResponse.setId(studentResponse.getId());
		studentResponse.setAge(student.getAge());
		studentResponse.setName(student.getName());
		studentResponse.setYear(student.getYear());
		studentResponse.setBranch(student.getBranch());
		return studentResponse;
	}
	private static final Student toStudent(StudentRequest studentRequest) {
		final Student student=new Student();
		student.setId(student.getId());
		student.setAge(student.getAge());
		student.setName(student.getName());
		student.setYear(student.getYear());
		student.setBranch(student.getBranch());
		return student;
	}
}
