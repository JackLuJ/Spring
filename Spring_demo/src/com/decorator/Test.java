package com.decorator;

public class Test {

	public static void main(String[] args) {
		Logger logger = new ConsoleLogger();
		Decorator decoratorLogger = new JsonDecorator(logger);
		decoratorLogger.error("输出");
	}
}
