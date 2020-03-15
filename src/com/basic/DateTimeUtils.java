package com.basic;

public class DateTimeUtils {
	
	public native String getSystemTime();
	 
    static {
        System.loadLibrary("nativedatetimeutils");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeUtils dt = new DateTimeUtils();
		
		System.out.println(dt.getSystemTime());
		

	}

}
