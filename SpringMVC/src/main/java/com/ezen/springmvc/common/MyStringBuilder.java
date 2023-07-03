package com.ezen.springmvc.common;

public class MyStringBuilder {

	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
}
