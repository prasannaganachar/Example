package com.collection;

abstract interface A{
	 public   int f();
	 
	 static int d=10;
	 
	 final int g=20;
	 
	}

	interface B{
	  int f();
	}
	
	abstract class test {
		int a=0, b=0;
		public  abstract void test1();
		
		public final void test2() {
			System.out.println("Test");
		}
		
		public  test(int a1, int b1) {
			a=a1;
			b=b1;
		}
		
		
	}
	
	
	class MainClass  extends test implements A,B {

		int c=0;
		MainClass(int a1, int b1, int c1) {
			super(a1,b1);
			c=c1;
		}
		@Override
		public int f() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void test1() {
			// TODO Auto-generated method stub
			
		}
		
	}

public class TestInteface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MainClass mc = new MainClass(10, 21, 31);
		
		System.out.println(mc.a);
	}

}
