package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
public class Parameter {
	private String username;
	private String password;
	
	private String url;
	private String driver;
	private String sql;
//	@Autowired
	@Value(value = "0000000000")
	public void setUsername(String username) {
		this.username = username;
	}
//	@Autowired
	public void setPassword(String password) {
		this.password = password;
	}
	@Autowired
	public void setUrl(String url) {
		this.url = url;
	}
	@Autowired
	public void setDriver(String driver) {
		this.driver = driver;
	}
	@Autowired
	public void setSql(String sql) {
		this.sql = sql;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getUrl() {
		return url;
	}
	public String getDriver() {
		return driver;
	}
	public String getSql() {
		return sql;
	}
	public String toString(){
		 String ret = "Driver : " + this.getDriver() 
		 				+  "Url : " + this.getUrl() 
		 				+"Sql : " + this.getSql()
		 				+"Username : " + this.getUsername()
		 				+"Password : " + this.getPassword();
		return ret;
	}
	

}
