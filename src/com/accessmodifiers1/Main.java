package com.accessmodifiers1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoyChild bc = new BoyChild();
		Parent parent = new Parent();
		BoyChild.setNoOfLegs(10);
		Parent.setNoOfLegs(20);
		System.out.println(" legs "+BoyChild.getNoOfLegs());
		System.out.println(" legs "+Parent.getNoOfLegs());
		
		//bc.setGender("Boy2");
		
		//System.out.println(" Gender :" + bc.gender);
		
		/*Parent parent = new Parent() {
			
			@Override
			protected void setGender(String gender) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			protected String getGender() {
				// TODO Auto-generated method stub
				return null;
			}
		};*/
		
		//System.out.println(" legs" + parent.getNoOfLegs());

	}

}
