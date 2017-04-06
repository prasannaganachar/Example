package com.collection;

import java.util.LinkedHashMap;

public class HashMapCustomMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	           HashMapCustom<Integer, Integer> hashMapCustom = new HashMapCustom<Integer, Integer>();
	           hashMapCustom.put(21, 12);
	           hashMapCustom.put(25, 121);
	           hashMapCustom.put(30, 151);
	           hashMapCustom.put(33, 15);
	           hashMapCustom.put(35, 89);
	 
	           System.out.println("value corresponding to key 21="
	                        + hashMapCustom.get(21));
	           System.out.println("value corresponding to key 51="
	                        + hashMapCustom.get(51));
	 
	           System.out.print("Displaying : ");
	           hashMapCustom.display();
	 
	           System.out.println("\n\nvalue corresponding to key 21 removed: "
	                        + hashMapCustom.remove(21));
	           System.out.println("value corresponding to key 51 removed: "
	                        + hashMapCustom.remove(51));
	 
	           System.out.print("Displaying : ");
	           hashMapCustom.display();
	           
	           LinkedHashMap<String, String> lhm = new LinkedHashMap<>();

	}

}
