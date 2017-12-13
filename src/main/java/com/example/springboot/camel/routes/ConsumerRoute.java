package com.example.springboot.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ConsumerRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		from("jms:queue:activemq/queue/TestQueue")
		.log(">>Consumer Route body: ${body}");
	}
	
}
