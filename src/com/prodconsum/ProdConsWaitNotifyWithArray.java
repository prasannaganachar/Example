package com.prodconsum;

import java.util.ArrayList;
import java.util.Random;

public class ProdConsWaitNotifyWithArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final ProdConsWaitNotifyWithArray prodConsWaitNotifyWithArray = new ProdConsWaitNotifyWithArray();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					prodConsWaitNotifyWithArray.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					prodConsWaitNotifyWithArray.cnsumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();

	}
	
	ArrayList<Integer> list = new ArrayList<Integer>(10);
	Object lock = new Object();
	public void producer() throws InterruptedException {
		
		Random random = new Random(100);
		
		synchronized (lock) {
			while(true) {
				if (list.size() == 10) {
					lock.wait();
				}
				list.add(random.nextInt(100));
				lock.notify();
			}
		}
		
	}
	
	public void cnsumer() throws InterruptedException {
		
		Thread.sleep(2000);
		
		synchronized (lock) {
			
			while(true) {
				
				if (list.size() == 0) {
					lock.wait();
				}
				
				System.out.println(" value taken :" + list.remove(0));
				lock.notify();
			}
		}
	}

}
