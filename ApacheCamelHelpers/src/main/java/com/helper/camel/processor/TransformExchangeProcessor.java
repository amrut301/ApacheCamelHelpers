package com.helper.camel.processor;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

/**
 * @author amrmalaj
 *
 */
@Component("transformExchangeProcessor")
public class TransformExchangeProcessor extends AbstractBaseProcessor {
	@Override
	public void process(Exchange exchange) throws Exception {
		try {
			if (exchange.getIn().getBody() instanceof String) {
				System.out.println("Message Transformed");
			}

		} catch (Exception e) {

		}
	}

}
