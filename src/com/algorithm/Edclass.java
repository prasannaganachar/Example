package com.algorithm;

import java.util.Arrays;

public class Edclass {

	/**
	 * @param args
	 */
	
	
	static int x=2;
	
	
	class inner {
		//static final int y=3;
		static final int z=4;
	}
	
	static class test {
		static int z=5;
		static final int y=3;
	}
	/*Edclass() {
		//main(null);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edclass ed = new Edclass();
		
		/*int b=2;
		System.out.println(b+3);
		System.out.println("" +b+3);
		System.out.println(b+3 + "");
		System.out.println(b & 3);
		*/
		
		
		Object obj[] = {27,"java",44};
		
		Arrays.sort(obj);
		
		float t = 2.18F;
		float t3 = 1234;
		float t4 = (float) 41.10;
		
		for(Object num : obj) {
			System.out.println("" +num);
		}
		/*System.out.println("prasanna");
		
		loop:
			for(int j=0;j<4;j++) {
				for (int k=0;k<2;k++) {
					System.out.println(j);
					if(j==3 || k==1) {
						break;
					}
					if(j==0 && j==2) {
						break loop;
					}
				}
				
			}*/

	}

}
