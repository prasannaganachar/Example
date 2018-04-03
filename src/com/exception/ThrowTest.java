package com.exception;

public class ThrowTest {

	public static void aMethod() throws Exception
	{
		try {
			//This will  throw exception into calling method and it will execute catch block and final block in called method
			// if catch block is added in this method it will catch in this method it self and execute final block of code. 
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("a method exception");
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
* ############## OUTPUT 1 with out catch block in method ###########
Finally
Exception
finished
*/



/**
* ############## OUTPUT 2 with catch block of code ###########
a method exception
Finally
finished
*/