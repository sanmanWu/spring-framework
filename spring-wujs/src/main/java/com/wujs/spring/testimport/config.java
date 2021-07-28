package com.wujs.spring.testimport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author WuJS
 * @date 2021/6/21
 * @desc
 */
@Configuration
public class config {
	@Bean
	CarFactoryBean carFactoryBean() {
		return new CarFactoryBean();
	}
}
