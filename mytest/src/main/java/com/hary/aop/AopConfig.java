package com.hary.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.PostConstruct;

/**
 * @author ankoye@qq.com
 * @date 2021/03/05
 */
@ComponentScan("com.hary.aop")
@EnableAspectJAutoProxy(
		exposeProxy = true
//		,proxyTargetClass = true
)
@Configuration
public class AopConfig {

	@PostConstruct
	public void initABC() {
		System.out.println("init");
	}

}
