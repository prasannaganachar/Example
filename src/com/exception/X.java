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

	
	public static void badMethod() throws Exception {
		// TODO Auto-generated method stub
		//throw new Exception();
		throw new Error();
	}

}

//##################OUT PUT##################
/******
 * 1 if throwgh exception it would excecute catch follwed by finally block and follwed by end statement
 * out put is 
 * B
 * C
 * D
 */ 


/******
 * 1 if throw Error it would excecute finally block and throw error message
 * out put is 
 * C
 * Error mesage
 */