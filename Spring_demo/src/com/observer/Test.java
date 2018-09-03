package com.observer;

import java.util.HashMap;
import java.util.Map;

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
		Map<String, Object> map = new HashMap<>();
		map.put("1", "昨天做完了什么");
		map.put("2", "今天要做什么");
		subject.notifyObservers(map);
		subject.notifyObservers("继续开会!");
	}

}
