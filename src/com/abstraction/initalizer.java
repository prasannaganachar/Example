package com.abstraction;
abstract class A2
{
	{
		System.out.println("AAA");
	}
}

abstract class B2 extends A2
{
	{
		System.out.println("BBB");
	}
}

class C2 extends B2
{
	{
		System.out.println("CCC");
	}
}

public class initalizer
{
	public static void main(String[] args)
	{
		C2 c = new C2();
		
	}
}

/*********OUTPUT**********
		AAA
		BBB
		CCC
*/