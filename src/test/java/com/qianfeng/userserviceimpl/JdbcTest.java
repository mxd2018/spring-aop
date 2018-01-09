package com.qianfeng.userserviceimpl;

import java.beans.PropertyVetoException;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcTest {
	@Test
	public void TestSpringJdbc() throws PropertyVetoException{
		ComboPooledDataSource cDataSource = new ComboPooledDataSource();
		cDataSource.setDriverClass("com.mysql.jdbc.Driver");
		cDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spring01");
		cDataSource.setUser("root");
		cDataSource.setPassword("123");
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate(cDataSource);
		String sql="insert into student values(?,?)";
		jdbcTemplate.update(sql,2,"赶作业赶作业");
	}
}
