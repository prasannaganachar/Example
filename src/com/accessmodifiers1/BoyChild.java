package com.accessmodifiers1;

public class BoyChild extends Parent {

	
	//String gender;
	/*public final String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}*/
	
	public static void setNoOfLegs(int noOfLegs12) {
		noOfLegs = noOfLegs12;
		System.out.println("Test child");
	}
	
	public static int getNoOfLegs() {
		System.out.println(" child legs "+noOfLegs);
		return noOfLegs;
	}
}
