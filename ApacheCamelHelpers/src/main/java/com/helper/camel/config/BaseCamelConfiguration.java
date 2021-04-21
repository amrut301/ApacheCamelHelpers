package com.helper.camel.config;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import com.helper.camel.route.InitCamelRouteBuilder;

/**
 * @author amrmalaj
 *
 */
@Configuration
public class BaseCamelConfiguration extends CamelConfiguration {
	@Autowired
	@Qualifier("initCamelRouteBuilder")
	private InitCamelRouteBuilder initCamelRouteBuilder;

	@Override
	public List<RouteBuilder> routes() {
		List<RouteBuilder> routeBuilders = new ArrayList<>();
		/*
		 *
		 * if
		 * (edgeConfigurationProperties.getIaimType().equals(EdgeConstants.IAIM_CLOUD))
		 * { routeBuilders.add(setJmsConfigurationRouteBuilder); }
		 */
		return routeBuilders;
	}
}
