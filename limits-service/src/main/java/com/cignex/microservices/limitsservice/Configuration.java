package com.cignex.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties("limits-service")
@Getter @Setter
public class Configuration {

	private int maximum;
	private int minimum;
	
}
