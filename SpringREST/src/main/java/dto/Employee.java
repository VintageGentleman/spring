package dto;

import lombok.Data;

@Data
public class Employee {
	private Integer emp_id;
	private String first_name;
	private String last_name;
	private Integer salary;
}
