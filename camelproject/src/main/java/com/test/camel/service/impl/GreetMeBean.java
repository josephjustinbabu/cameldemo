/**
 * 
 */
package com.test.camel.service.impl;

import org.springframework.stereotype.Service;

import com.test.camel.service.Greeter;

/**
 * @author josephj001
 *
 */
@Service("greetMeBean")
public class GreetMeBean {
	private Greeter greeter;
	private String messageFromJms;
	/**
	 * @param greeter
	 */
	public void setGreeter(Greeter greeter){
		this.greeter = greeter;
	}
	
	public void setMessageFromJms(String messageFromJms){
		this.messageFromJms = messageFromJms;
	}
	
	/**
	 * 
	 */
	public void execute(){
		System.out.println(greeter.sayHello());
	}
	
	public void messageFromJMS(){
		System.out.println("Message From JMS: " + messageFromJms);
	}
}

