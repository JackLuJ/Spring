package com.observer;

public interface ISubject {

	public void register(IObserver obs);
	
	public void unregister(IObserver obs);
	
	public void notifyObservers(Object data);
}
