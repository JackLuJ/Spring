package com.observer;

import java.util.Vector;

public class Subject implements ISubject {
	Vector<IObserver> list = new Vector<IObserver>();

	@Override
	public void register(IObserver obs) {
		list.add(obs);
	}

	@Override
	public void unregister(IObserver obs) {
		if(list.contains(obs)) list.remove(obs);
	}

	@Override
	public void notifyObservers(Object data) {
		for(IObserver obs : list) {
			obs.refresh(data);
		}
	}

}
