package com.helper.camel.controller;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.ExchangeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helper.bo.InitConfiguratioBo;
import com.helper.camel.route.InitCamelRouteBuilder;
import com.helper.constant.RouteConstants;

/**
 * @author amrmalaj
 *
 */
@RestController
public class InitRouteController {
	@Autowired
	private CamelContext camelContext;

	
	@Qualifier("initCamelRouteBuilder")
	@Autowired
	private InitCamelRouteBuilder initCamelRouteBuilder;

	@Autowired
	private ProducerTemplate producer;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean getEdgeConfigurationDetails(@RequestBody InitConfiguratioBo configuration) throws Exception {
		try {
			if (null == configuration) {
				throw new Exception("Error in configuring the routes");
			} else {
				try {
					if (camelContext.getRouteStatus(RouteConstants.INIT_ROUTE_ID) == null) {
						camelContext.addRoutes(initCamelRouteBuilder);
					}
					if (camelContext.getRouteStatus(RouteConstants.START_ROUTES_ID) != null
							&& !camelContext.getRouteStatus(RouteConstants.START_ROUTES_ID).isStarted()) {
						camelContext.startAllRoutes();
						Exchange postExchange = ExchangeBuilder.anExchange(camelContext).withBody(configuration)
								.build();
						producer.send(RouteConstants.COMPONENT_DIRECT + RouteConstants.CONFIG_TIMER, postExchange);
					}
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		} catch (Throwable t) {
			System.out.println("Exception while parsing the edge configuration details " + t);
			throw new Exception(t);
		}
		return Boolean.TRUE;
	}
}
