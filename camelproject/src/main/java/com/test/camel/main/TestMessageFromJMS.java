/**
 * 
 */
package com.test.camel.main;

import jdk.internal.dynalink.support.TypeConverterFactory;

import org.apache.camel.CamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.camel.converters.GreetMeBeanConverter;
import com.test.camel.service.impl.GreetMeBean;

/**
 * @author josephj001
 *
 */
public class TestMessageFromJMS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ApplicationContext appContext = null;
		CamelContext camelContext = null;
		try{
			appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			camelContext = (CamelContext)appContext.getBean("camel5");
			camelContext.setTypeConverterStatisticsEnabled(true);
			//camelContext.getTypeConverterRegistry().addTypeConverter(MyOrder.class, String.class, new MyOrderTypeConverter());
			camelContext.getTypeConverterRegistry().addTypeConverter(GreetMeBean.class, 
				String.class, new GreetMeBeanConverter());
			camelContext.start();
			Thread.sleep(1000);
			camelContext.stop();
			
		}catch(Exception e){
			System.out.println("Error: " + e.toString());
		}finally{
			camelContext = null;
			appContext = null;
		}

	}

}
