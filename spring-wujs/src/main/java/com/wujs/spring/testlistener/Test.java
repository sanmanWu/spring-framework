package com.wujs.spring.testlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
public class Test {
	public static void main(String[] args) {
		final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ctx.publishEvent(new ApplicationEvent("发布事件") {
			
		});
		ctx.close();
	}
}
