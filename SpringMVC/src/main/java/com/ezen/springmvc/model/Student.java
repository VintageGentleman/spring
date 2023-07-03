package com.ezen.springmvc.model;

public class Student {

	protected String name;
	private String grade;

	public Student() {
		name = "기본 이름";
		grade = "기본 등급";
	}
	
	public Student(String name, String grade) {
		this.grade = grade;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("%s[%s]\n", name, grade);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
