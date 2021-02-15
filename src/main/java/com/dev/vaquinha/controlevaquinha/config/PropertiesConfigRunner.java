package com.dev.vaquinha.controlevaquinha.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;


@Component
public class PropertiesConfigRunner implements ApplicationRunner {

	private static final Logger LOG =
		      LoggerFactory.getLogger(PropertiesConfigRunner.class);
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOG.info("Application started with option names : {}", 
		          args.getOptionNames());
		propertySourcesPlaceholderConfigurer();
	}

	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	    
		PropertySourcesPlaceholderConfigurer properties = 
	      new PropertySourcesPlaceholderConfigurer();
	    properties.setLocation(new FileSystemResource("/Users/home/conf.properties"));
	    properties.setIgnoreResourceNotFound(false);
	    return properties;
	}
}
