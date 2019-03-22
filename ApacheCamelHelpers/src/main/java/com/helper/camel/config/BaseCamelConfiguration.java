package com.helper.camel.config;

import java.util.List;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * @author amrmalaj
 *
 */
@Configuration
public class BaseCamelConfiguration extends CamelConfiguration {

	@Override
	public List<RouteBuilder> routes() {
		return super.routes();
	}
}
