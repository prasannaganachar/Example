package com.thread;

import java.util.concurrent.Semaphore;

public class OddEvenSemPhore {

	/**
	 * @param args
	 */
	
	static Object lock =  new Object();
	Semaphore sem = new Semaphore(1);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadEven threadEven = new OddEvenSemPhore().new ThreadEven();
		Thread t1 = new Thread(threadEven);
		ThreadOdd threadOdd = new OddEvenSemPhore().new ThreadOdd();
		Thread t2 = new Thread(threadOdd);
		
		try {
			//t1.join();
			
			t2.start();
			t1.start();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	class ThreadEven implements Runnable {

		@Override
		public void run() {
			try {
				sem.acquire();
				for(int i=2;i<20;i+=2) {
					if (i%2 == 1) {
						System.out.println("" + i);

					}
					sem.release();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
    class ThreadOdd implements Runnable {
	   public void run() {
		   try {
					sem.acquire();
					for(int i=1;i<20;i++) {
						if (i%2 == 0) {
							System.out.println("" + i);
							//sem.release();
						}
						sem.release();
					}				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
      }
}
