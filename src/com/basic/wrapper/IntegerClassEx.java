package com.basic.wrapper;

public class IntegerClassEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		//################## Integer to Binary,octal,hex decimal format ######
		
		System.out.println("************* Integer to Binary,octal,hex decimal format ***********");
		System.out.println("4 to Binary  Conversion :" +Integer.toBinaryString(4));
		System.out.println("8 to Octal  Conversion :" +Integer.toOctalString(8));
		System.out.println("15 to Hex decimal Conversion :" +Integer.toHexString(15));
		
		
		System.out.println("");
		System.out.println("************* Binary,octal and hex deciaml to Integer string ***********");
		System.out.println("100 (Binary) to Integer :" +Integer.valueOf("100", 2));
		System.out.println("11 (Octal) to Integer :" +Integer.valueOf("11", 7));
		System.out.println("f (Hex) to Integer :" +Integer.valueOf("f", 16));
		//System.out.println(Integer.valueOf("101",2));
		
		
		System.out.println();
		System.out.println("************* BIT COUNT (Number of once in binary number) ***********");
		
		System.out.println("Bit count of 3 :" +Integer.bitCount(3));
		System.out.println("Bit count of 7:" +Integer.bitCount(7));
		System.out.println("Bit count of 15:" +Integer.bitCount(15));
		
		System.out.println();
		System.out.println("************* Integaer to double,long,float etc ***********");
		Integer num = new Integer(14);
		System.out.println("double value :" +num.doubleValue());
		System.out.println("float value :" +num.floatValue());
		System.out.println("long value :" +num.longValue());
		System.out.println("String value :" +num.toString());
		System.out.println(" value :" +num.toString());
		
		System.out.println();
		System.out.println("************* Double,Float, Long and Byte type Example ********");
		Double dnum = new Double(1000000000.3);
		System.out.println("10.3 Double to Int value: " +dnum.intValue());
		
		System.out.println();
		System.out.println("********************SIZE OF WARRPER CLASS*********");
		System.out.printf("Byte Type Size : %s \nShort Type Size : %s \nIntgere Type Size : %s\nLong Type Size : %s \n\nFloat Type Size : %s \nDouble Type Size : %s\n\nCharacter Type Size : %s",
				Byte.SIZE,Short.SIZE,Integer.SIZE,Long.SIZE,Float.SIZE,Double.SIZE,Character.SIZE);
	}

}

/**
	************* Integer to Binary,octal,hex decimal format ***********
	4 to Binary  Conversion :100
	8 to Octal  Conversion :10
	15 to Hex decimal Conversion :f
	
	************* Binary,octal and hex deciaml to Integer string ***********
	100 (Binary) to Integer :4
	11 (Octal) to Integer :8
	f (Hex) to Integer :15
	
	************* BIT COUNT (Number of once in binary number) ***********
	Bit count of 3 :2
	Bit count of 7:3
	Bit count of 15:4
	
	************* Integaer to double,long,float etc ***********
	double value :14.0
	float value :14.0
	long value :14

**/