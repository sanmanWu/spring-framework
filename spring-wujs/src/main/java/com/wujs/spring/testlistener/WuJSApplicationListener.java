package com.wujs.spring.testlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author WuJS
 * @date 2021/6/23
 * @desc
 */
@Component
public class WuJSApplicationListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("接收到一个事件：" + event);
	}
}
