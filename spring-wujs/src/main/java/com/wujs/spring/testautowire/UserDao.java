package com.wujs.spring.testautowire;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
public class UserDao {
	private String beanName;

	public UserDao(String beanName) {
		this.beanName = beanName;
	}

	@Override
	public String toString() {
		return "UserDao{" +
				"beanName='" + beanName + '\'' +
				'}';
	}
}
