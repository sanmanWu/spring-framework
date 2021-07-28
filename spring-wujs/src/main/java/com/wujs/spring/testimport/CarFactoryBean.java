package com.wujs.spring.testimport;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author WuJS
 * @date 2021/6/22
 * @desc
 */
public class CarFactoryBean implements FactoryBean<Car> {
	@Override
	public Car getObject() throws Exception {
		return new Car();
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
