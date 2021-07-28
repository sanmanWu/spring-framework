package com.wujs.spring.testlifecycle;

import org.springframework.stereotype.Component;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
@Component
public class WuJS {
	public WuJS() {
		System.out.println("WuJS 的构造方法");
	}
}
