package com.abstraction;

/**
 * 
 * when ever creating object it will execute following order
 * 1. static block
 * 2. intitalizer block
 * 3. constractor
 *
 */

abstract class ABC
{
	{
		System.out.println("grand parent");
	}
	
	static {
		System.out.println(" grand parent staick block");
	}
}
abstract class XYZ extends ABC
{
	{
		System.out.println(1);
	}
	
	static {
		System.out.println("parent class");
	}
	
	public XYZ()
	{
		System.out.println(2);
		
		abstractMethod();
	}
	
	abstract void abstractMethod();
}

class PQR extends XYZ
{
	{
		System.out.println(3);
	}
	
	static {
		System.out.println("child class");
	}
	public PQR()
	{
		System.out.println(4);
	}
	
	@Override
	void abstractMethod()
	{
		System.out.println(5);	
	}
}

public class constracotInitilazer
{
	public static void main(String[] args)
	{
		PQR pqr = new PQR();
	}
}