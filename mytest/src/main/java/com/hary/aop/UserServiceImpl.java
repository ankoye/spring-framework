package com.hary.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * @author ankoye@qq.com
 * @date 2021/03/10
 */
@Component
public class UserServiceImpl implements UserService {

	@Override
	public void sayHello() {
		System.out.println("hello");

		this.after();
		System.out.println("----------------- AopContext begin");
		((UserService) AopContext.currentProxy()).after();
		System.out.println("----------------- AopContext end");
	}

	@Override
	public void after() {
		System.out.println("after");
	}
}
