package com.basic;

import java.lang.reflect.Field;

public class Reflection {

	static int age;
	private CacheManager c = new Cac
	public Reflection() {
		// TODO Auto-generated constructor stub
	}
	
	public Reflection(int a) {
		age = a;
	}
	public static void getName() {
		System.out.println("Prasanna");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class class1 = Reflection.class;
		BrackContinue brackContinue = new BrackContinue();
		
		System.out.println(brackContinue.getClass().getClassLoader());
		
		try {
			Field field = brackContinue.getClass().getDeclaredField("name");
			field.setAccessible(true);
			System.out.println(field.getName());
			try {
				field.set(brackContinue, "test");
				System.out.println(field.get(brackContinue));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//field[0
		//System.out.println(null);
	}

}
