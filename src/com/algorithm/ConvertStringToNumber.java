package com.algorithm;

public class ConvertStringToNumber {

	public int StringToInteger(String s1) {
		
		char ch[] = s1.toCharArray();
		
		int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        for(char c:ch){
            int tmpAscii = (int)c;
            sum = (sum*10)+(tmpAscii-zeroAscii);
        }
        return sum;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" zero ascii value " + (int)'0');
		ConvertStringToNumber convertStringToNumber = new ConvertStringToNumber();
		System.out.println("converted value : " +convertStringToNumber.StringToInteger("25"));
	}

}
