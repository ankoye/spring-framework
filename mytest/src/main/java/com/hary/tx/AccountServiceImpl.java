package com.hary.tx;

import org.springframework.aop.framework.AopContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

/**
 * @author ankoye@qq.com
 * @date 2021/03/12
 */
@Service
public class AccountServiceImpl implements AccountService {
	private JdbcTemplate jdbcTemplate;

	public AccountServiceImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void update() {
		jdbcTemplate.update("update user set username = 'aaa' where id = 1");
		System.out.println("update");

		((AccountService) AopContext.currentProxy()).create();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public void create() {
		jdbcTemplate.execute("insert into user(username, password) values ('aa', 'bbb')");
		System.out.println("create");
	}
}
