package com.abstraction;
interface X22
{
	char c = 'A';
	
	char methodX();
}

class Y22 implements X22
{
	{
		System.out.println("inside class Y22:" +c);
	}
	
	public char methodX()
	{
		char c = this.c;
		
		return ++c;
	}
}

public class StaticVariable
{
	public static void main(String[] args)
	{
		Y22 y = new Y22();
		
		System.out.println("inside main:"+y.methodX());
		
		System.out.println(y.c);
		
		System.out.println(X22.c);
	}
}