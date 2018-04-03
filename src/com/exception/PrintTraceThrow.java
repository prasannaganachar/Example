package com.exception;

public class PrintTraceThrow {

	public void method1() throws Exception {
		System.out.println("method1");
		method2();
	}
	
	private void method2() throws Exception{
		System.out.println("method2");
		method3();
	}
	private Exception method3() throws Exception {
		System.out.println("method3");
		return new Exception();	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTraceThrow pt = new PrintTraceThrow();
		try {
			pt.method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("test");
		}
	}

}
