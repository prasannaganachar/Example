package com.accessmodifiers2;

import com.accessmodifiers1.BoyChild;
import com.accessmodifiers1.Parent;

public class GirlChild extends BoyChild {

	private String gender;
	protected  String getGender() {
		return gender;
	}

	protected void setGender(String gender) {
		this.gender = gender;
	}
	
	public static void setNoOfLegs(int noOfLegs12) {
		//noOfLegs = noOfLegs12;
		System.out.println("Test child");
	}

}
