package com.basic.wrapper;

public class BoolenType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean("Door");
		
		Boolean b3 = Boolean.parseBoolean("true");
		
		System.out.println(b3 + "" + b1 +"" +b2);
		System.out.println(b1.equals(b2));

	}

}
