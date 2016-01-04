package com.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.model.Dao;

@Component("daoimpl")
public class DaoImpl {
	private Dao mysqlDao;
	private Dao mssqlDao;
	public Dao getMysqlDao() {
		return mysqlDao;
	}
	@Autowired
	@Qualifier("mysql")
	public void setMysqlDao(Dao mysqlDao) {
		this.mysqlDao = mysqlDao;
	}
	
	public Dao getMssqlDao() {
		return mssqlDao;
	}
	@Autowired
	@Qualifier("mssql")
	public void setMssqlDao(Dao mssqlDao) {
		this.mssqlDao = mssqlDao;
	}
	public void moniter(){
		mysqlDao.moniter();
		mssqlDao.moniter();
	}
}
