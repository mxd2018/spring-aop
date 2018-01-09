package com.qianfeng.studentdaoimpl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.qianfeng.pojo.po.Student;
import com.qianfeng.studentdao.IStudent;

public class StudentImpl extends JdbcDaoSupport implements IStudent {
	

	@Override
	public void findStu(int id) {
		String sql="selet * from student where id=?";
		/*Student student = this.getJdbcTemplate().queryForObject(sql, Student.class, id);
		System.out.println(student);*/
	}

	@Override
	public void saveStu(Integer id, String name) {
		String sql="insert into student values(?,?)";
		this.getJdbcTemplate().update(sql,id,name);
		
	}

}
