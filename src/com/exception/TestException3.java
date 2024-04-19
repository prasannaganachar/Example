package com.exception;

public class TestException3 {

	public static void main(String[] args) {
		try{
		bar();
		}catch(NullPointerException e){
			//e = new Exception("");
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		foo();
	}

	public static void bar() throws Exception {
		throw new RuntimeException("bar method");
	}
	
	public static void foo() throws NullPointerException{
		throw new NullPointerException("foo method");
	}

}
