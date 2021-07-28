package com.wujs.spring.testlifecycle;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
public class Car {

	public Car() {
		System.out.println("Car 的构造方法");
	}

	public void chuShiHua() {
		System.out.println("初始化方法");
	}

	public void xiaoHui(){
		System.out.println("销毁方法");
	}
}
