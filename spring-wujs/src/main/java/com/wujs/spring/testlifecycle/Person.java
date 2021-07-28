package com.wujs.spring.testlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
public class Person implements InitializingBean, DisposableBean {

	public Person() {
		System.out.println("Person 的构造方法");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean 的 destroy 方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 的 afterPropertiesSet 方法");
	}
}
