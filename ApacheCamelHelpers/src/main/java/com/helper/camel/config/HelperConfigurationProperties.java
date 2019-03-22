package com.helper.camel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author amrmalaj
 *
 */
@Configuration("helperConfigurationProperties")
@PropertySource({"${spring.config.location:classpath:/application.properties}"})
public class HelperConfigurationProperties {

}
