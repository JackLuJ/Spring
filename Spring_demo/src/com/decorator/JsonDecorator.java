package com.decorator;

public class JsonDecorator extends Decorator {

	public JsonDecorator(Logger logger) {
		super(logger);
	}

	@Override
	public void error(String str) {
		System.out.println("parse Json");
		logger.error(str);
	}

}
