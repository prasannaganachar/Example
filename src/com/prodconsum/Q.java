package com.prodconsum;

public class Q {
	int n;
	boolean valueSet = false;
	
	synchronized int get() {
		while(!valueSet) {
			try {
				wait();
			}
		    catch (InterruptedException e) {
				System.out.println("Interrupted Exception");
			}
		System.out.println("Got:"+n);
		valueSet = false;
		notify();
		return n;
		}
		return 0;
	}
	
	synchronized void put(int n) {
		while(valueSet)
			try {
				wait();
			}
		    catch (InterruptedException e) {
			  System.out.println("InterruptedException");
		    }
		this.n = n;
		valueSet = true;
		notify();
		System.out.println("Put:" +n);
	}
}
