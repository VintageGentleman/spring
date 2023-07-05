package com.ezen.springdatabase.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
	private Integer employee_id;
	private String first_name;
	private String last_name;
	private Integer salary;
	private Integer manager_id;
	private String department_name;
}
