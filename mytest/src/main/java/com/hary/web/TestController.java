package com.hary.web;

import com.hary.context.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ankoye@qq.com
 * @date 2021/03/15
 */
@Controller
public class TestController {

	@ResponseBody
	@RequestMapping("/test")
	public User test() {
		return new User();
	}
}
