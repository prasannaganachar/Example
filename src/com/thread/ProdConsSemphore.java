package com.thread;

import java.util.concurrent.Semaphore;

public class ProdConsSemphore {

	/**
	 * @param args
	 */
	class Q {
		int n;
		
		Semaphore semCon = new Semaphore(0);
		Semaphore semPrd = new Semaphore(1);
		
		void get() {
			try {
				semCon.acquire();
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(" got n :"+n);
			semPrd.release();
		}
		
		void put(int n) {
			try {
				semPrd.acquire();
			
			} catch (Exception e) {
				// TODO: handle exception
			}
			this.n = n;
			System.out.println("Put: "+ n);
			semCon.release();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q q1 = new ProdConsSemphore().new Q();
		Producer producer = new ProdConsSemphore().new Producer(q1);
		Consumer consumer = new ProdConsSemphore().new Consumer(q1);
		
	}
	
	class Producer implements Runnable {
        Q q;
		public Producer(Q q1) {
			q=q1;
			new Thread(this).start();
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<20;i++) {
				q.put(i);
			}
		}
		
	}
	
	class Consumer implements Runnable {
		Q q1;
		
		public Consumer(Q q) {
			q1=q;
			new Thread(this).start();
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<20;i++) {
				q1.get();
			}
		}		
	}

}
