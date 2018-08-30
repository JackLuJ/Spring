package com.observer;

public class Observer implements IObserver {
	
	String name;
	
	public Observer(String name) {
		this.name = name;
	}

	@Override
	public void refresh(String data) {
		System.out.println(name+"接到通知:"+data);
	}

}
