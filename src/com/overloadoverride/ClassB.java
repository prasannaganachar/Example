package com.overloadoverride;


public class ClassB extends ClassA {
	
	int b = 30;
	public int getValue(int a) {
		System.out.println(" value a for class B "+a);
		return a;
	}
	
	double getDoubleValue() {
		return 20.5;
	}
}
