package com.hary;

import com.hary.aop.AopConfig;
import com.hary.aop.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ankoye@qq.com
 * @date 2021/03/05
 */
public class AopApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		UserService userService = context.getBean(UserService.class);
		userService.sayHello();
		userService.after();
	}
}
