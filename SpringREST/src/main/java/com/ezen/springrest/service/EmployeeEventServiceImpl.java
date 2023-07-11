package com.ezen.springrest.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.ezen.springrest.dto.EmployeeDTO;
import com.ezen.springrest.mapper.EmployeeEventMapper;

@Primary
@Service
public class EmployeeEventServiceImpl implements EmployeeEventService {

	@Autowired
	EmployeeEventMapper eeMapper;
	
	@Override
	public List<EmployeeDTO> initEventPage() {
		return eeMapper.selectAll();
	}

	@Override
	public List<EmployeeDTO> getRandomEmployees(int size) {
		List<EmployeeDTO> list = eeMapper.selectAll();
		Collections.shuffle(list);
		return list.subList(0, 10);
	}

}
