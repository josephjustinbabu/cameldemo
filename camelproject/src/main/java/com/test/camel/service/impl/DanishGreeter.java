/**
 * 
 */
package com.test.camel.service.impl;

import com.test.camel.service.Greeter;

/**
 * @author josephj001
 *
 */
public class DanishGreeter implements Greeter {
	
	/* (non-Javadoc)
	 * @see com.src.camel.service.Greeter#sayHello()
	 */
	public String sayHello(){
		return "Hello Dave, Good Morning!!";
	}

}
