package com.ObserverObserable;

import java.util.Observable;

public class BeingObserable extends Observable{
	void counter(int period) {
		for(; period >=0; period--) {
			setChanged();
			System.out.println(" has changed:"+hasChanged());
			notifyObservers(new Integer(period));
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("Sleep Interrupted");
			}
		}
	}

}
