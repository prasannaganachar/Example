package com.exception;

public class divideByzero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 0;
			int y = 5/x;
			float num = 5/0;
		}
		catch(Exception e) {
			System.out.println("Exception E");
		}
		//catch(ArithmeticException aex) {
			// compilation fails
		//}
	}

}
