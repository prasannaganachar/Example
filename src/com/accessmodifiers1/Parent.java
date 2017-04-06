package com.accessmodifiers1;

public /*abstract*/ class Parent {
	
	static int noOfLegs = 2;
	int noOfHands = 2;
	protected static String gender = "boy";
	
	
	public static int getNoOfLegs() {
		System.out.println(" paren legs "+noOfLegs);
		return noOfLegs;
	}
	public static void setNoOfLegs(int noOfLegs123) {
		//this.noOfLegs = noOfLegs;
		
		noOfLegs = noOfLegs123;
	}
	/*public int getNoOfHands() {
		return noOfHands;
	}
	public void setNoOfHands(int noOfHands) {
		this.noOfHands = noOfHands;
	}*/
	
	
	//---------- Implemention with out abstract class
	/*public  static String getGender() {
		return gender;
	}
	
	void setGender(String gender) {
		this.gender = gender;
	}*/
	
	//--------------  Abstract method------
	
	/*protected abstract String  getGender();
	
	protected abstract void setGender(String gender);
	*/

}
