package com.prodconsum;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		System.out.println("Press Control-c to stop");

	}

}
