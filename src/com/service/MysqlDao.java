package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Dao;
import com.model.Parameter;
@Service("mysql")
public class MysqlDao implements Dao {
	private Parameter mysqlPara;//This name must be associate with bean name Since it's autowired 
	
	 
	public Parameter getMysqlPara() {
		return mysqlPara;
	}

	@Autowired
	public void setMysqlPara(Parameter mysqlPara) {
		this.mysqlPara = mysqlPara;
	}


	@Override
	public void moniter() {
		// TODO Auto-generated method stub
		System.out.println("This is mysql connection...");
		System.out.println(mysqlPara);

	}

}
