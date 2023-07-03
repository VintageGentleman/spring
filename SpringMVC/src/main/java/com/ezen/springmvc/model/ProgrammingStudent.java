package com.ezen.springmvc.model;

import org.springframework.stereotype.Repository;

// Student가 필요한 자리에 대신 들어가게 된다

@Repository
public class ProgrammingStudent extends Student {
	
	private int java;
	
	public ProgrammingStudent() {
		super();
		java = 10;
	}
	
	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	@Override
	public String toString() {
		return String.format("%s[%d점]", name, java);
	}
	
}
