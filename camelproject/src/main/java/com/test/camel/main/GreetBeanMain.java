/**
 * 
 */
package com.test.camel.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.camel.service.impl.GreetMeBean;

/**
 * @author josephj001
 *
 */
public class GreetBeanMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = "Justin";
		String name = null;
		try{
			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			GreetMeBean greeter = (GreetMeBean)context.getBean("greetMeBean");
			greeter.execute();
		}catch(Exception e){
			System.out.println("Error: " + e.toString());
		}finally{
			context = null;
		}
	}

}
