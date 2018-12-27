package com.overloadoverride;

import java.io.IOException;

public class OverloadMain {

	/**
	 * @param args
	 * @return 
	 */
	
	static void add(String s){
		System.out.println(" str concate " + s + s);
	}
	
	/*public void print(String x ) {
		System.out.println(" print string x");
	}*/
	public void print(Integer x ) {
		System.out.println(" print intger x");
	}

	public void print(Object x) {
		System.out.println(" print object x");
	}
	int add(int a, int b) {
		return a+b;
	}
		
	double add(double a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c){
		return a+b+c;
	}
	
	{
		System.out.println(" defualt method 1");
	}
	static {
		System.out.println(" defualt static method");
	}
	
	//main is overloading
	public static void main(int a) {
		System.out.println("A value "+a);
	}
	public static void main(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		OverloadMain addMain = new OverloadMain();
		//System.out.println(" Add Int Twoo "+ addMain.add(10,20));
	//	System.out.println(" Add double Twoo "+ addMain.add(10.5,20));
		
		//main(10);
		addMain.print(null);
		//addMain.print(20);
		
		//B b = new B();
		//b.add("test");
		
		
		A a = new A();
	//	a.add("a string");
	}

}

class A extends OverloadMain {
	
	A() throws Exception{
		System.out.println(" a class");
	}
}

class B extends A {

	B() throws Exception {
		
		super();
		System.out.println(" B class");
		// TODO Auto-generated constructor stub
	}
	
}