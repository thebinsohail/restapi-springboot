package com.rest.api.models;

public class Teacher {
	
	private String name;
	private int age;
	private String qualification;
	private String department;
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	private String degree;

	public Teacher(String name,int age,String department,String qualification,String degree){
		
		super();
		this.name=name;
		this.qualification=qualification;
		this.age=age;
		this.degree=degree;
		this.department=department;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
}
