package com.wujs.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author WuJS
 * @date 2021/6/21
 * @desc
 */
public class test {
	public static void main(String[] args) {
		final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		final HelloWorld helloWorld = ctx.getBean("helloWorld", HelloWorld.class);
		helloWorld.sayHello("yxm");
	}
}
