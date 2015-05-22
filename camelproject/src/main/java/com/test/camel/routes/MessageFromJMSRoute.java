/**
 * 
 */
package com.test.camel.routes;

import org.apache.camel.builder.RouteBuilder;

/**
 * @author josephj001
 *
 */
public class MessageFromJMSRoute extends RouteBuilder {

	/* (non-Javadoc)
	 * @see org.apache.camel.builder.RouteBuilder#configure()
	 */
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("jms:queue:testQ").beanRef("greetMeBean", "setMessageFromJms");
	}

}
