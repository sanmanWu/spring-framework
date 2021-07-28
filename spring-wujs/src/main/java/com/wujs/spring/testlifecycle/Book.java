package com.wujs.spring.testlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
public class Book {
	public Book() {
		System.out.println("Book 的构造方法");
	}

	@PostConstruct
	public void init() {
		System.out.println("Book 的 PostConstruct 方法");
	}

	@PreDestroy
	public void destory() {
		System.out.println("Book 的 PreDestroy 方法");
	}
}
