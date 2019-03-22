package com.helper.camel;

import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author amrmalaj
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { CamelAutoConfiguration.class, ActiveMQAutoConfiguration.class })
@EnableJpaRepositories
public class ApacheCamelHelpersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheCamelHelpersApplication.class, args);
	}

}
