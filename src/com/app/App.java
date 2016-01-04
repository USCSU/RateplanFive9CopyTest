package com.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.consumer.DaoImpl;
public class App {
	public static void main(String[] sargs){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		DaoImpl daoimpl = (DaoImpl)ctx.getBean("daoimpl");
		daoimpl.moniter();
	}
}
