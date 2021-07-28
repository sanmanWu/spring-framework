package com.wujs.spring.testlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
@Component
public class WuJSBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof WuJS) {
			System.out.println("WuJS 执行 postProcessBeforeInitialization 方法");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof WuJS) {
			System.out.println("WuJS 执行 postProcessAfterInitialization 方法");
		}
		return bean;
	}
}
