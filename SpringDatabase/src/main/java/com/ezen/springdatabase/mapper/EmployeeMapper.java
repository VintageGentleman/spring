package com.ezen.springdatabase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ezen.springdatabase.dto.EmployeeDTO;

public interface EmployeeMapper {

	@Select("SELECT * FROM employees")
	List<EmployeeDTO> getAll();

	@Select("SELECT * FROM employees INNER JOIN departments USING(department_id)")
	List<EmployeeDTO> getAll2();
}
