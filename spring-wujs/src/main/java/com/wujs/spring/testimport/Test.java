package com.wujs.spring.testimport;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author WuJS
 * @date 2021/6/22
 * @desc
 */
public class Test {
	public static void main(String[] args) {
		final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		final Object carFactoryBean = ctx.getBean("carFactoryBean");
		System.out.println(carFactoryBean);
//		com.wujs.spring.testimport.Car@28f3b248
		final Object factoryBean = ctx.getBean("&carFactoryBean");
		System.out.println(factoryBean);
//		com.wujs.spring.testimport.CarFactoryBean@1b1426f4
	}
}
