package com.proxy;

public class UserSeverImpl implements UserSever {

	@Override
	public void selectUser(){
		System.out.println("我是。。。");
		throw new RuntimeException("异常了");
	}

}
