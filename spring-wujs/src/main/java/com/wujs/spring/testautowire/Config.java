package com.wujs.spring.testautowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
@Configuration
@ComponentScan
public class Config {
	@Bean
	public UserDao userDao() {
		return new UserDao("userDao");
	}

	@Bean
	public UserDao userDao1() {
		return new UserDao("userDao1");
	}
}
