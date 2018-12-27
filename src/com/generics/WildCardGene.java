package com.generics;

import java.util.ArrayList;

public class WildCardGene {
	
	//**********UPper bound wild card
	static void processElementsNumber(ArrayList<? extends Number> a) {
		for (Number element : a)
        {
            System.out.println(element);
        }
	}
	
	
	//***************8UNKOWND TYPE WILD CARD
	static void processElements(ArrayList<?> a)
    {
        for (Object element : a)
        {
            System.out.println(element);
        }
    }
	
	//************8LOWER BOUND WILD CARD***********
	static void processElementsLowerBound(ArrayList<? super Integer> a)
    {
        for (Object element : a)
        {
            System.out.println(element);
        }
        
        /*
         * ArrayList<Double> a2 = new ArrayList<>();
        a2.add(21.35);
        a2.add(56.47);
        a2.add(78.12);
        //This will not work
         */
         
    }

}
