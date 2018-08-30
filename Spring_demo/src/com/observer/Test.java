package com.observer;

public class Test {

	public static void main(String[] args) {
		IObserver qq = new Observer("qq");
		IObserver ww = new Observer("ww");
		IObserver ee = new Observer("ee");
		IObserver rr = new Observer("rr");
		Subject subject = new Subject();
		subject.register(qq);
		subject.register(ww);
		subject.register(ee);
		subject.register(rr);
		subject.notifyObservers("大家听好了!");
		subject.notifyObservers("ww你出去!");
		subject.unregister(ww);
		subject.notifyObservers("继续开会!");
	}

}
