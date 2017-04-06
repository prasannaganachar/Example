package com.basic;

public class BrackContinue {

	class A{}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		
		for (int k=0;k<5;k++) {
			//OUTER:
			for(int j=0;j<i;j++) {
				if (j==9) {
					break;
				}
				if (j%2 == 0) {
					continue;
				}
				System.out.println(" I Value "+j);
			}
		}
		
		switch(2){
		case 10:
			System.out.println("Value 10 ");
			break;
		case 20:
			System.out.println("Value 20 ");
			break;
		}

	}

}
