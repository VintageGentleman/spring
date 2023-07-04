package com.ezen.springmvc.model;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

public class EmployeeTest {

	private static Logger log = LogManager.getLogger(EmployeeTest.class);
	
	@Test
	public void test() {
		log.info(new EmployeeDTO("Smith", "King", new Date(), 5000));
	}
	
	@Test
	public void test2() {
		log.info(new EmployeeDTO("King", 8000));
	}

}
