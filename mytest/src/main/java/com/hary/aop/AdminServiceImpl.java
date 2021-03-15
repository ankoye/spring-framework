package com.hary.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ankoye@qq.com
 * @date 2021/03/15
 */
@Component
public class AdminServiceImpl implements AdminService {

	@Autowired
	private UserService userService;

	@Override
	public void sayWorld() {
		System.out.println("world");
	}
}
