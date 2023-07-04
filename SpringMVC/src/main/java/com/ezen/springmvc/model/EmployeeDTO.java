package com.ezen.springmvc.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 롬복이 Getter, Setter, 생성자, toString 등을 모두 자동으로 생성해준다

// 연습문제: EmployeeDTO 클래스의 인스턴스를 하나 생성하여 출력하는 테스트케이스를 작성해보세요
//		  (반드시 log4j를 이용해 콘솔에 출력할 것)

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Getter
public class EmployeeDTO {
	@Setter
	private String first_name;
	@NonNull
	private String last_name;
	private Date hire_date;
	@Setter @NonNull 
	private Integer salary;
}
