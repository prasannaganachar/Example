package com.basic;

public class FinalVarInitilazation {

	final String name;
	
	final static String address;
	
	/******************* 1 ****************
	 * A blank final variable can be initialized inside instance-initializer block or inside constructor. 
	 * If you have more than one constructor in your class then it must be initialized in all of them, 
	 * otherwise compile time error will be thrown.
	 */
	FinalVarInitilazation() {
		//name = "prasanna";
	}
	{
		name = "prasanna";
	}
	
	
	/*
	 * A blank final static variable can be initialized inside static block.
	 */
	static {
		address = "kumar";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
