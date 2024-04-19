package com.exception;

public class RTExcept {

	public static void throwit() {
		System.out.println("throwit");
		throw new RuntimeException();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("hello");
			throwit();
		}
		catch(RuntimeException e) {
			System.out.println("Run time Caught");
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("after");

	}

}

/**
 * ###########OUT PUT#########
 * hellow, throwit
 * caugt, finally, after
 * */
