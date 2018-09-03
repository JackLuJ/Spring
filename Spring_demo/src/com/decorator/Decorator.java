package com.decorator;

public abstract class Decorator implements Logger {

	protected Logger logger;

	public Decorator(Logger logger) {
		this.logger = logger;
	}

}
