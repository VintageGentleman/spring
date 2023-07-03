package com.ezen.springmvc.common;

import org.springframework.stereotype.Repository;

@Repository
public class MyReducer_Imp implements MyReducer {

	@Override
	public Integer reduce(Integer[] arr) {
		int sum = 0;
		
		for(Integer num : arr) {
			sum += num == null ? 0 : num; 
		}
		
		return sum;
	}

}
