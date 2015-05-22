/**
 * 
 */
package com.test.camel.service;

/**
 * @author josephj001
 *
 */
public interface Greeter {
	/**
	 * @return
	 */
	public String sayHello();
	
	/**
	 * @param message
	 */
	public String messageFromJMS(String message);
}
