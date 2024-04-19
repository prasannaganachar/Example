package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchorinzedEx {

	Random random = new Random(10);
	Object lock1 = new Object();
	Object lock2 = new Object();
	private List<Integer> list = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	/**
	 * These two method will lock at the method leavel, which mean that one thread can execute only one method at time. 
	 */
	/*public synchronized void stageOne() {
		
		
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		list.add(random.nextInt());
	}
	
	public synchronized void stageTwo() {
		try {
			Thread.sleep(1);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		list2.add(random.nextInt());
	}
	*/
	
	
public synchronized void stageOne() {
		
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		list.add(random.nextInt());
	}
	
	public synchronized void stageTwo() {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		list2.add(random.nextInt());
	}
	
	
	public void process() {
		for (int i=0;i<10;i++) {
			stageOne();
			stageTwo();
		}
	}
	
	
	public static void main(String args[]) {
		System.out.println("starting....");
		final SynchorinzedEx synchorinzedEx = new SynchorinzedEx();
		
		int start = (int) System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Thread T1 Run");
				synchorinzedEx.process();
				
			}
		});
		
      Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Thread T2 Run");
				synchorinzedEx.process();
			}
		});
		
       t1.start();
	   t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int end = (int) System.currentTimeMillis();
		
		System.out.println("list 1 size :" + synchorinzedEx.list.size() + " list 2 size :" + synchorinzedEx.list2.size() + " time : "+ (end-start));
		
	}
}
