package com.hary;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.startup.Tomcat;

/**
 * @author ankoye@qq.com
 * @date 2021/03/15
 */
public class WebApplication {
	public static void main(String[] args) throws Exception {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		// 用这两行代码，就可以不用导额外的jsp包，也不会报错
		Context context = tomcat.addContext("/", System.getProperty("java.io.tmpdir"));
		context.addLifecycleListener((LifecycleListener) Class.forName(tomcat.getHost().getConfigClass()).getDeclaredConstructor().newInstance());

		tomcat.start();
		tomcat.getServer().await();
	}
}
