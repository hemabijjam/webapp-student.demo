package com.in.hema.jpa.bijjam.h2db.demo.json;

import com.in.hema.jpa.bijjam.h2db.demo.entity.Branch;

public class StudentRequest {
	private String name;
	private Branch branch;
	private Integer age;
	private Integer year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

}
