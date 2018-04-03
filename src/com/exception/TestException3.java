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

	public static void bar(){
		
	}
	
	public static void foo() throws NullPointerException{
		
	}

}
