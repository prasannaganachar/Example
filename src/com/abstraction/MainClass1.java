package com.abstraction;
abstract class Calculate
{
	abstract int add(int a, int b);
}

public class MainClass1
{
	public static void main(String[] args)
	{
		int result = new Calculate()
		{	
			@Override
			int add(int a, int b)
			{
				return a+b;
			}
		}.add(10, 20);
		
		System.out.println(result);
	}
}

/**************OUTPUT*************
 * 30
*/