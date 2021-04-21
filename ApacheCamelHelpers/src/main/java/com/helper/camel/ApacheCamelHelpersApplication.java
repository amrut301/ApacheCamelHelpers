package com.helper.camel;

import javax.sql.DataSource;

import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

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
