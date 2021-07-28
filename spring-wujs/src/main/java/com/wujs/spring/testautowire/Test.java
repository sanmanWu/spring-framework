package com.wujs.spring.testautowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
public class Test {
	public static void main(String[] args) {
		final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		final UserService bean = ctx.getBean(UserService.class);
		bean.showUserDao();
	}
}
