package com.ObserverObserable;

import java.util.Observable;
import java.util.Observer;

public class WatcherObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println(" Update called :"+ ((Integer)arg).intValue());
		
	}

}
