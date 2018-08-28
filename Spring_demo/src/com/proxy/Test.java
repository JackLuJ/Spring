package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		UserSeverImpl u = new UserSeverImpl();
		InvocationHandler handler = new ProxyHandler(u);
		UserSever up = (UserSever) Proxy.newProxyInstance(Test.class.getClassLoader(), 
				u.getClass().getInterfaces(), handler);
		up.selectUser();
	}
}
