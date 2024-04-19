package com.bitwise;

public class PositiveNagative {

	static int findPosNagative(int i) 
	{ 
	    int k = (i >> 31);
		int m = (-i >> 31);
		return 1 + (i >> 31) - (-i >> 31);
	} 
	
	public static void main(String[] args) {
		
		int[] nums = {10,-25,30,-9,0};
		
		for (int i : nums) {
			int num = PositiveNagative.findPosNagative(i);
			
			switch(num) {
			case 1: 
				System.out.println("  zero Number :" +i);
				break;
			case 2: 
				System.out.println(" positive Number :" +i);
				break;
			default: 
				System.out.println(" nagative Number :" +i);
				break;
			}
		}
		

	}

}
