package com.exception;

public class X {

	int i;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			badMethod();
			System.out.println("A");
		}
		catch (Exception ex) {
			System.out.println("B");
		}
		finally {
			System.out.println("C");
		}
		
		System.out.println("D");

	}

	
	public static void badMethod() {
		// TODO Auto-generated method stub
		throw new Error();
	}

}
