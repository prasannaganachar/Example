package com.bitwise;

public class OddEvenNumber {
	
	static Boolean findOddEven(int number) {
		
		// 8 => 1000 & 0001 = 0000
		// 9 => 1001 & 0001 = 0001
		if ((number & 1) == 0 ) 
			return true; 
		
		return false;
	}

	public static void main(String[] args) {
		
		if (OddEvenNumber.findOddEven(8))
			System.out.println(" 8 is even");
		if (!OddEvenNumber.findOddEven(9))
			System.out.println(" 9 is odd ");
		
		
	}

}
