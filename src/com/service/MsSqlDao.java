package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.model.Dao;
import com.model.Parameter;
@Service("mssql")
@Primary
public class MsSqlDao implements Dao{
	
	private Parameter mssqlPara;

	public Parameter getMssqlPara() {
		return mssqlPara;
	}
	@Autowired
	public void setMssqlPara(Parameter mssqlPara) {
		this.mssqlPara = mssqlPara;
	}

	public void moniter(){
		System.out.println("this is mssql connection try..");
		System.out.println(mssqlPara);
	}
}
