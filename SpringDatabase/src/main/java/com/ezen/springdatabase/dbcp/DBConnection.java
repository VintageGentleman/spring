package com.ezen.springdatabase.dbcp;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DBConnection {

	public static HikariDataSource getDataSource() {
		HikariConfig config = new HikariConfig();

		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
		config.setUsername("hr");
		config.setPassword("1234");
		config.setMinimumIdle(3); // 3개까지는 아무리 놀아도 유지하겠다
		config.setMaximumPoolSize(10); // 최대 10개의 연결까지 늘릴 수 있다
		config.setIdleTimeout(1000 * 60 * 10); // 10분 놀면 연결을 해제한다
		
		// 설정을 전달해 DB커넥션 풀 객체를 생성
		return new HikariDataSource(config);
	}
	
}
