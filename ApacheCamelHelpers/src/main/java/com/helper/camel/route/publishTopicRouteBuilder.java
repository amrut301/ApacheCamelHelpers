package com.helper.camel.route;

import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author amrmalaj
 *
 */
@Component("publishTopicRouteBuilder")
public class publishTopicRouteBuilder extends BaseRouteBuilder {
	@Qualifier("transformExchangeProcessor")
	@Autowired
	private Processor transformExchangeProcessor;

	@Override
	public void configure() throws Exception {

		from("activemq:topic:publishTopic")
			.process(transformExchangeProcessor);
				
	}

}
