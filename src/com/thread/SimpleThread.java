package com.thread;

public class SimpleThread {

	static int count=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ThreadOne threadOne = new ThreadOne();
			ThreadTwo threadTwo = new ThreadTwo();
			Thread thread = new Thread(threadOne);
			Thread thread2 = new Thread(threadTwo);
			thread.start();
			thread.interrupt();
			
			try {
				thread.join();
				thread2.start();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	static class ThreadOne implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10;i++) {
				System.out.println("t1 :"+ ++count);
			}
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
