package com.accessmodifiers2;

import com.accessmodifiers1.BoyChild;
import com.accessmodifiers1.Parent;

public class GirlChild extends BoyChild {
	
	public  String getGender() {
		return gender;
	}

	protected void setGender(String gender) {
		this.gender = gender;
	}

}
