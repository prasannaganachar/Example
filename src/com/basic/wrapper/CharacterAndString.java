package com.basic.wrapper;

import java.io.UnsupportedEncodingException;

public class CharacterAndString {

	/*
	 * ******************ASCII Alphabetic CODE ****************
	 * A - 65    a - 97     0 - 48
	 * B - 66    b - 98     1 - 49
	 * --        --         ---
	 * Z - 90    z - 122    9 - 57
	 */
	public static void main(String[] args) {
			
		Character char1 = new Character('4');
	
		System.out.println();
		System.out.println("*************** alphabetic related method*********");
		System.out.println("Is Alphabetic :"+Character.isAlphabetic(48)); // 48 means 0 digit value
		System.out.println("z is lowercase letter :" +Character.isLowerCase(122));
		System.out.println("A is lowercase letter :" +Character.isLowerCase('A'));
		System.out.println("A is uppercase letter :" +Character.isUpperCase('A'));
		System.out.println("is letter or digit : " + Character.isLetterOrDigit('2'));
		
		System.out.println();
		System.out.println("**************CHARACTER DIGIT*******");
		System.out.println("0 is Number : " + Character.isDigit('0'));
		System.out.println("0 charcter to ASCII CODE :" +(int)'0');
		System.out.println("A charcter to ASCII CODE :" +(int)'A');
		
		System.out.println();
		System.out.println("**********ASCII code to alphabetic/number ets  ******");
		System.out.println("65 ASCII CODE  : "+(char)65);
		System.out.println("48 ASCII code : "+(char)48);
		
		String s ="abc123";
		try {
			byte[] bytes = s.getBytes("US-ASCII");
			for(byte b:bytes) {
				System.out.println(b + " ASCII CODE : " + (char)b);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/**
	*************** alphabetic related method*********
		Is Alphabetic :false
		z is lowercase letter :true
		A is lowercase letter :false
		A is uppercase letter :true
		is letter or digit : true
	
	**************CHARACTER DIGIT*******
		0 is Number : true
		0 charcter to ASCII CODE :48
		A charcter to ASCII CODE :65
	
	**********ASCII code to alphabetic/number ets  ******
		65 ASCII CODE  : A
		48 ASCII code : 0
		97 ASCII CODE : a
		98 ASCII CODE : b
		99 ASCII CODE : c
		49 ASCII CODE : 1
		50 ASCII CODE : 2
		51 ASCII CODE : 3

*/
