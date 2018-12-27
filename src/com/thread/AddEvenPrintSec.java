package com.thread;

public class AddEvenPrintSec {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Object res = new Object();
		
		class  OddThred extends Thread {
			public void run() {
				
				for (int i=0;i<50;i++)	{
					synchronized (res) {
						if (i%2 !=0) {
							System.out.println(i);
							res.notify();
							try {
								res.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}

		}
		
		class EvenThread implements Runnable {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for (int i=0;i<=50;i++){
					synchronized (res) {
						if (i%2 == 0) {
							System.out.println(i);
							res.notify();
							try {
								res.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}	
				}			
			}
		}
		
		Thread thread = new Thread(new EvenThread());
		thread.start();
		OddThred oddThred = new OddThred();
		oddThred.start();

	}
}
