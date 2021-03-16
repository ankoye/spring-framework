package com.hary.web;

import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author ankoye@qq.com
 * @date 2021/03/15
 */
@Component
public class MyWebApplicationInitializer implements WebApplicationInitializer {

	/**
	 * 根据servlet 3.0规范，web容器需要回调被 @HandlesTypes(WebApplicationInitializer.class)
	 * 申明过的实现类的 onStartup 方法
	 * @param servletContext the {@code ServletContext} to initialize
	 * @throws ServletException
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebConfig.class);
		// ctx.refresh();
		DispatcherServlet dispatcher = new DispatcherServlet(ctx);
		ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", dispatcher);
		registration.setLoadOnStartup(1);
		registration.addMapping("/*");
	}
}
