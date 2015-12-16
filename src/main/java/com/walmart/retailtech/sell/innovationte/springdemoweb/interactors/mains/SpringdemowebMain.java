package com.walmart.retailtech.sell.innovationte.springdemoweb.interactors.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.walmart.retailtech.sell.innovationte.springdemoweb.entities.Associate;

public class SpringdemowebMain {
	
	static final ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("spring/application-config.xml");
	
	public static void main(String[] args)
	{	
		Associate associate = ctx.getBean( "associate", Associate.class );
		
		System.out.println( associate );
	}

}
