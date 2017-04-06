package com.ObserverObserable;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeingObserable obserable = new BeingObserable();
		WatcherObserver observer = new WatcherObserver();
		WatcherObserver observer2 = new WatcherObserver();
		
		obserable.addObserver(observer);
		obserable.addObserver(observer2);
		obserable.counter(10);

	}

}
