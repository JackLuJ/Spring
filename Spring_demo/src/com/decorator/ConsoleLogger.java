package com.decorator;

public class ConsoleLogger implements Logger {

	@Override
	public void error(String str) {
		System.out.println(str);
	}

}
