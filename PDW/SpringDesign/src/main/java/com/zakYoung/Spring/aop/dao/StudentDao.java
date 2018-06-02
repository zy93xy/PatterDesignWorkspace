package com.zakYoung.Spring.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	public void update(){
		System.out.println("修改数据");
	}
}
