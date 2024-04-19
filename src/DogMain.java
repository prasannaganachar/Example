
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class DogMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		//TreeMap<String, Integer> map = new TreeMap<>();
		map.put("abcdef", 15);
		map.put("abcdfg", 25);
		map.put("abcdfg", 35);
		map.put(null, 35);
		map.put(null, 3);
	//	System.out.println(" Size"+map.size());
		List<Dog> list = new ArrayList<Dog>();

	      list.add(new Dog("Shaggy",3));
	      list.add(new Dog("Lacy",2));
	      list.add(new Dog("Roger",10));
	      list.add(new Dog("Tommy",4));
	      list.add(new Dog("Tammy",1));

		  System.out.println(list.toArray().toString());
	      Collections.sort(list);// Sorts the array list

	      for(Dog a: list)//printing the sorted list of names
	         System.out.print(a.getDogName() + ", ");

	      // Sorts the array list using comparator
	      Collections.sort(list, new Dog());
	      System.out.println(" ");
	      for(Dog a: list)//printing the sorted list of ages
	         System.out.print(a.getDogName() +"  : "+
			 a.getDogAge() + ", ");

	}

}
