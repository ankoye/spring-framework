package com.hary;

import com.hary.tx.AccountService;
import com.hary.tx.TxConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ankoye@qq.com
 * @date 2021/03/12
 */
public class TxApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
		AccountService accountService = applicationContext.getBean(AccountService.class);
		accountService.update();
	}
}
