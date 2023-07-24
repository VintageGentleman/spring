package com.ezen.springrest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dto.Employee;

public interface EmployeeMapper {
	
	List<Employee> select();
	
	int insert(@Param("emp") Employee emp);
	
	int update(@Param("emp") Employee emp);
	
	int delete(@Param("id") int id);

}
