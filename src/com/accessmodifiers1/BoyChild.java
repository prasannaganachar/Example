package com.accessmodifiers1;

import com.accessmodifiers1.Parent;
public class BoyChild extends Parent {

	
	final static Integer i;
	
	static {
		i=20;
	}
	
	public BoyChild() {
		// TODO Auto-generated constructor stub
		//i=10;
	}
	String gender;
	private String getGender() {
		return gender;
	}
	
	public String getPrasanna() {
		return "prasanna_rithvik";
	}

	/*public void setGender(String gender) {
		this.gender = gender;
	}*/
	
	public static void setNoOfLegs(int noOfLegs12) {
		//noOfLegs = noOfLegs12;
		System.out.println("Test child");
	}
	
	public static int getNoOfLegs() {
		/*System.out.println(" child legs "+noOfLegs);
		return noOfLegs;*/
		return 0;
	}
}
