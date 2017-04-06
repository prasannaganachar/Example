package com.exception;

public class ThrowTest {

	public static void aMethod() throws Exception
	{
		try {
			throw new Exception();
		}
		finally {
			System.out.println("Finally");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	aMethod();
        }
        catch (Exception e) {
        	System.out.println("Exception");
        }
        finally {
        	System.out.println("finished");
        }
	}

}
/**
* ############## OUTPUT ###########
Finally
Exception
finished
*/