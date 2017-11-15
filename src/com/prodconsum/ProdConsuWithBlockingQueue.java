package com.prodconsum;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConsuWithBlockingQueue {

	static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(10);
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					producer();
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
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();


	}
	
	public static void producer() throws InterruptedException {
		Random random = new Random();
		
		while(true) {
			blockingQueue.put(random.nextInt(1000));
		}
	}
	
	public static void consumer() throws InterruptedException {
		Random random = new Random(1000);
		while(true) {
			Thread.sleep(100);
			
			//if(random.nextInt(10) == 0) {
				Integer value = blockingQueue.take();
				System.out.println(" value taken :" + value + "; size :" + blockingQueue.size());
			//}
		}
	}

}
