package com.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	
	private Object proxied;

	public ProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("准备工作!");
		
		Object object = null;
		try {
			object = method.invoke(proxied, args);
		} catch (Exception e) {
			System.out.println("发生异常"+e.getCause().getMessage());
			e.printStackTrace();
		}
		
		System.out.println("工作结束!");
		
		return object;
	}

}
