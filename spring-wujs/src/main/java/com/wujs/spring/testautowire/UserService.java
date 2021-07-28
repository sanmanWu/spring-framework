package com.wujs.spring.testautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
@Component
public class UserService {
	@Autowired
	UserDao userDao;
	@Autowired
	UserDao userDao1;

	public void showUserDao() {
		System.out.println(userDao);
		System.out.println(userDao1);
	}
}
