package com.abstraction;
interface ABC1
{
	void methodOne();
}

interface PQR1 extends ABC1
{	
	void methodTwo();
}

abstract class XYZ1 implements PQR1
{
	public void methodOne()
	{
		methodTwo();
	}
}

class MNO extends XYZ1
{
	public void methodTwo()
	{
		methodOne();
	}
}

public class InfinitInterfaceMethod
{
	public static void main(String[] args)
	{
		ABC1 abc = new MNO();
		
		abc.methodOne();
	}
}