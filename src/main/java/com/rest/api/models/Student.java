package com.rest.api.models;

public class Student {

	private String name;
	private int batch;
	private String dept;
	
	public Student(String name,int batch,String dept){
		super();
		this.name=name;
		this.batch=batch;
		this.dept=dept;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
