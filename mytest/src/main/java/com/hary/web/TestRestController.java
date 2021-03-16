package com.hary.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ankoye@qq.com
 * @date 2021/03/15
 */
@RestController
public class TestRestController {

	@RequestMapping("/rest/test")
	public String sayHello() {
		return "hello";
	}
}
