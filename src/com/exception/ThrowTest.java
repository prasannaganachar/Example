package com.exception;

import java.io.IOException;
import java.lang.Math;

public class ThrowTest {

	class Calculator {
		double power(int n, int p) throws Exception {
			if (p < 0 || n < 0) {
				 throw new Exception("n and p should be non-negative.");
			}
			else {
				return Math.pow(n, p);
			}
		}
	}
	public static void aMethod()
	{
		try {
			//This will  throw exception into calling method and it will execute catch block and final block in called method
			// if catch block is added in this method it will catch in this method it self and execute final block of code. 
			throw new IOException();
		}
		catch(IOException e) {
			System.out.println("a method exception");
		}
		finally {
			System.out.println("Finally");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        try {
        	//aMethod();
        	throw new Exception();
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