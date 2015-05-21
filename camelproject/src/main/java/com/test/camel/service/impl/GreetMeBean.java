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
	
	/**
	 * @param greeter
	 */
	public void setGreeter(Greeter greeter){
		this.greeter = greeter;
	}
	
	/**
	 * 
	 */
	public void execute(){
		System.out.println(greeter.sayHello());
	}
}

