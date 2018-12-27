package com.algorithm;

import java.util.Arrays;

class Solution {

	
	public int calculateTimeTaken(int a[], int speed, int numberOffile) {
		
		Arrays.sort(a);
		 
		int numberOfsencond = 0;
		 
		for(int i=0;i<a.length;i++) {
		 
			double timeTaken = speed/(numberOffile-i);		
			numberOfsencond += Math.ceil(a[i]/timeTaken);
			
			if (a[i] == 0) {
				continue;
			}
			for(int j=i+1;j<a.length;j++) {
				a[j] = a[j]-a[i];
			}
		}

		return numberOfsencond;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution d = new Solution();
		
		int a[] = {84, 53, 96, 101, 53, 87, 89,42};
		
		int b[] = {79,64,23,53,47,103,100,109,68};
		
		int c[] = {30,24,26,25,100,98,78};
		
		System.out.println("A array value : " +d.calculateTimeTaken(a, 23, 8));
		
		System.out.println("B array value : " +d.calculateTimeTaken(b, 17, 9));
		
		System.out.println("C array value : " +d.calculateTimeTaken(c, 15, 7));
	}

}
