package com.overloadoverride;

public class OverrideMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//will get overrode method value
		ClassB classB = new ClassB();
		
		//System.out.println("class b value "+classB.getDoubleValue());
		
		System.out.println("class b value "+classB.getValue(10));
		
		System.out.println("b e "+classB.b); // wht val ? 
		
		//will get overrode method value from classB class
		ClassA classA = new ClassB();
		
		System.out.println("b e "+classA.b);
		
		//System.out.println("class b value "+classA.getValue(10));

	}

}
