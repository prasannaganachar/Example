package com.prodconsum;

import java.util.Scanner;

public class ProdConsuWaitNotify {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		final ProdConsuWaitNotify prodConsuWaitNotify = new ProdConsuWaitNotify();
		
		//prodConsuWaitNotify.consumer();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					prodConsuWaitNotify.producer();
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
					prodConsuWaitNotify.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t1.join();

	}
	
	public  void producer() throws InterruptedException {
		synchronized (this) {
			System.out.println(" starting....");
			wait(3000);
			System.out.println(" resumed.....");
		}
	}
	
	public void consumer() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Thread.sleep(2000);
		System.out.println("consumer method enter..");
		synchronized (this) {
			
			System.out.println(" entry key..");
			sc.nextLine();
			System.out.println(" enterd the key");
			notify();
			
		}
	}

}
