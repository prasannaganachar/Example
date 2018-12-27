package com.abstraction;


interface A
{
    void myMethod();
    int a=10;
}
class B
{
	interface inside {
		int k=0;
	}
    public void myMethod()
    {
        System.out.println("My Method");
    }
}
class C extends B implements A
{
	int getValue() {
		//A.a=20;
		return A.a;
	}
}
public class InterAndClass
{
    public static void main(String[] args) 
    {
        A a = new C();
        
        B b = new B();
        
        a.myMethod();
    }
}