/**
 * 
 */
package com.test.camel.service.impl;

import com.test.camel.service.Greeter;

/**
 * @author josephj001
 *
 */
public class EnglishGreeter implements Greeter {

	/* (non-Javadoc)
	 * @see com.src.camel.service.Greeter#sayHello()
	 */
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello " + System.getProperty("user.name");
	}

}
