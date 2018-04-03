package com.statice;

public class StaticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Derived derived = new Derived();
		derived.display();
		derived.print();
		
		Base derived1 = new Derived();
		derived1.display();
		derived1.print();*/
		
		StringBuilder st = new StringBuilder();
		
		for(int i=0;i<10;i++) {
			if(st.length() > 0) {
				st.append(",");
			}
			st.append("'"+"name-"+i+".address-"+i+"'");
		}
		
		System.out.println(st);

	}

}
