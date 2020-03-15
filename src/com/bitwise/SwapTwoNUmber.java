package com.bitwise;

public class SwapTwoNUmber {

	public static void main(String[] args) {
		Integer a = 10; //00001010
		Integer b = 9;  //00001001
		
		System.out.println("a and B number before swap :" + a +" "+b);
		
		a = a^b;  //00001010 ^ 00001001  = 00000011
		b = a^b;  //00000011 ^ 00001001 = 00001010
		a = a^b;  //00000011 ^ 00001010 = 00001010
		
		System.out.println("a and B number after swap :" + a +" "+b);

	}

}
