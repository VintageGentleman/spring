package com.ezen.springmvc.common;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTest {

	@Test
	public void test1() {
		assertEquals("apple", MyStringBuilder.reverse("apple"));
	}
	
	@Test
	public void test2() {
		assertEquals(null, MyStringBuilder.reverse(null));
	}
	
}
