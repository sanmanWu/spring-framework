package com.wujs.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author WuJS
 * @date 2021/6/21
 * @desc
 */
@Configuration
public class config {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
