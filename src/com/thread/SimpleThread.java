package com.thread;

public class SimpleThread {

	static int count=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   class inner {
			   int age;
			   
			   void setAge(int a) {
				   age = a;
			   }
			   
			   int getAge() {
				   return age;
			   }
		   }
		   
		   inner in = new inner();
		   in.setAge(10);
		   System.out.println("age: " +in.getAge());
			
			ThreadOne threadOne = new ThreadOne();
			threadOne.start();
			ThreadTwo threadTwo = new ThreadTwo();
			Thread thread = new Thread(threadOne);
			Thread thread2 = new Thread(threadTwo);
			//thread.start();
		thread2.start();
			//thread.interrupt();
			
			try {
				thread.join();
				thread2.start();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	static class ThreadOne implements Runnable {

		Thread t1;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10;i++) {
				System.out.println("t1 :"+ ++count);
			}
		}
		
		public void start() {
			System.out.println("start method");
			if(t1 == null)
				t1 = new Thread(this);
			
			t1.start();
			
		}
		
	}
	
	static class ThreadTwo implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10;i++) {
				System.out.println("t2: "+ ++count);
			}
		}
		
	}

}
