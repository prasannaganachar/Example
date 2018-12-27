package com.abstraction;
abstract class AA
{
	abstract void firstMethod();
	
	void secondMethod()
	{
		System.out.println("SECOND");
		
		firstMethod();
	}
}

abstract class BB extends AA
{
	@Override
	void firstMethod()
	{
		System.out.println("FIRST");
		
		thirdMethod();
	}
	
	abstract void thirdMethod();
}

class CC extends BB
{
	@Override
	void thirdMethod()
	{
		System.out.println("THIRD");
	}
}

public class MainClass2
{
	public static void main(String[] args)
	{
		CC c = new CC();
		
		c.firstMethod();
		
	    c.secondMethod();
		
		c.thirdMethod();
	}
}


/***************OUTPUT************
	FIRST
	THIRD
	SECOND
	FIRST
	THIRD
	THIRD
*/