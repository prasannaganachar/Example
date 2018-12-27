package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Destinaton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			List<List<Integer>> resList = new ArrayList<List<Integer>>();
			
			ArrayList<Integer> arrList = new ArrayList<Integer>();
			arrList.add(2);
			arrList.add(4);
			resList.add(arrList);
			
			
			//TreeMap<Double,ArrayList<List<Integer>>> hm = new TreeMap<Double, ArrayList<Integer>>();
			
			TreeMap<Double,ArrayList<Integer>> hm = new TreeMap<Double, ArrayList<Integer>>();
			Iterator<List<Integer>> ite = resList.iterator();
			
			while(ite.hasNext()) {
				//Iterator<Integer> inIter = (Iterator<Integer>)ite.next();
				ArrayList<Integer> inIter = (ArrayList<Integer>) ite.next();
				System.out.println(inIter.get(0) + "  " + inIter.get(1));
				
				ArrayList<List<Integer>> resList1 = new ArrayList<List<Integer>>();
				
				ArrayList<Integer> arrList1 = new ArrayList<Integer>();
				arrList1.add(inIter.get(0));
				arrList1.add(inIter.get(1));
				resList1.add(arrList1);
				hm.put(10.25, arrList1);
				
ArrayList<List<Integer>> resList2 = new ArrayList<List<Integer>>();
				
				ArrayList<Integer> arrList2= new ArrayList<Integer>();
				arrList2.add(24);
				arrList2.add(4);
				resList2.add(arrList2);
				hm.put(9.25, arrList2);

				/*Iterator<Integer> inIter = ((List<List<Integer>>) inIter).iterator();
				while(inIter.hasNext()) {
					System.out.println(inIter.next());
				}*/
			}
			
			//Set<Entry<Double, ArrayList<List<Integer>>>> set = hm.entrySet();
		      Iterator<Entry<Double, ArrayList<Integer>>> hmIterator = hm.entrySet().iterator();
		      while(hmIterator.hasNext()) {
		         Map.Entry mentry = (Map.Entry)hmIterator.next();
		         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
		         resList.add((List<Integer>) mentry.getValue());
		        // mentry.
		         System.out.println(mentry.getValue());
		      }
		      
		     // resList
	}

}



/*


import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.Math;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> ClosestXdestinations(int numDestinations, 
                                             List<List<Integer>> allLocations,
                                             int numDeliveries)
	{
	    int count = 0;
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        
        Iterator<List<Integer>> iteLoc = allLocations.iterator();
        
        TreeMap<Double,ArrayList<Integer>> hm = new TreeMap<Double, ArrayList<Integer>>();
        
        while(iteLoc.hasNext()) {
            ArrayList<Integer> inIter = (ArrayList<Integer>) iteLoc.next();
            
            double sqValue = Math.sqrt((inIter.get(0) * inIter.get(0)) + (inIter.get(1) * inIter.get(1)));
            
            
            ArrayList<List<Integer>> resList1 = new ArrayList<List<Integer>>();
				
			ArrayList<Integer> arrList1 = new ArrayList<Integer>();
			arrList1.add(inIter.get(0));
			arrList1.add(inIter.get(1));
			resList1.add(arrList1);
			hm.put(sqValue, arrList1);
            
        }
        
        
    
       
       Iterator<Entry<Double, ArrayList<Integer>>> hmIterator = hm.entrySet().iterator();
      while(hmIterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)hmIterator.next();
         
         if (count < numDeliveries) {
           resList.add((List<Integer>) mentry.getValue());
           count++;
         }
         else {
             count++;
         }
      } 
        
        return resList;
    }
    // METHOD SIGNATURE ENDS
}*/