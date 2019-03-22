package com.helper.camel.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.helper.constant.RouteConstants;

@Component("initCamelRouteBuilder")
public class InitCamelRouteBuilder extends BaseRouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://initTimer?repeatCount=1").routeId(RouteConstants.INIT_ROUTE_ID).process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {
				System.out.println("inti timer started");
			}
		});

	}

}
