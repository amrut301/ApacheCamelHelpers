package com.helper.camel.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.activemq.camel.component.ActiveMQConfiguration;
import org.apache.activemq.pool.PooledConnectionFactory;
import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author amrmalaj
 *
 */
@Configuration
public class MQConfiguration {

	@Autowired
	private CamelContext context;

	public void setJmsConnectionFactory() throws Exception {
		String activeMqUrl = "localhost:61616";

		if (activeMqUrl != null) {
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(activeMqUrl);
			connectionFactory.setTrustAllPackages(true);
			connectionFactory.setUserName("admin");
			connectionFactory.setPassword("admin");

			PooledConnectionFactory pooledConnectionFactory = new PooledConnectionFactory();
			pooledConnectionFactory.setConnectionFactory(connectionFactory);
			pooledConnectionFactory.setMaxConnections(10);
			pooledConnectionFactory.setMaximumActiveSessionPerConnection(10000);
			pooledConnectionFactory.setExpiryTimeout(300000);
			ActiveMQConfiguration activeMQConfiguration = new ActiveMQConfiguration();
			activeMQConfiguration.setUsePooledConnection(true);
			activeMQConfiguration.setConnectionFactory(pooledConnectionFactory);
			activeMQConfiguration.setTimeToLive(300000);
			ActiveMQComponent activeMQComponent = new ActiveMQComponent();
			activeMQComponent.setConfiguration(activeMQConfiguration);
			activeMQComponent.setDeliveryPersistent(false);
			activeMQComponent.setAsyncConsumer(true);
			context.addComponent("activemq", activeMQComponent);
			context.setUseMDCLogging(true);
			context.setHandleFault(true);
			
		}
	}

}
