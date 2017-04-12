package com.thread;

public class DeadLockExample {

	public static Object objectOne = new Object();
	public static Object objectTwo = new Object();

	public static void main(String args[]) {

		ThreadOne thread1 = new ThreadOne();
		ThreadTwo thread2 = new ThreadTwo();
		thread1.start();
		thread2.start();
	}

	private static class ThreadOne extends Thread {
		public void run() {
			synchronized (objectOne) {
				System.out.println("ThreadOne holding lock on objectOne!");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
				System.out.println("ThreadOne waiting for objectTwo....");
				synchronized (objectTwo) {
					System.out.println("!! ThreadOne acquired lock on ObjectTwo !!");
				}
			}
		}
	}

	private static class ThreadTwo extends Thread {
		public void run() {
			synchronized (objectTwo) {
				System.out.println("ThreadTwo holding lock on objectTwo!");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
				System.out.println("ThreadTwo waiting for objectOne....");
				synchronized (objectOne) {
					System.out.println("!! ThreadTwo acquired lock on objectOne !!");
				}
			}
		}
	}

}
