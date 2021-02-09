package com.hary.context;

import com.hary.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ankoye@qq.com
 * @date 2021/02/09
 */
public class ContextApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		User user = (User) ctx.getBean("user");
		System.out.println(user);
	}
}
