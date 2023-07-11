package com.ezen.springrest.service;

import java.util.List;

import com.ezen.springrest.dto.EmployeeDTO;

public interface EmployeeEventService {

	List<EmployeeDTO> initEventPage();

	List<EmployeeDTO> getRandomEmployees(int size);
	
}
