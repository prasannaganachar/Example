import java.util.HashMap;
import java.util.HashSet;


public class TestEqualsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestEquales testEquales = new TestEquales(10, "prasanna");
		
		TestEquales testEquales1 = new TestEquales(10, "prasanna");
		
		//System.out.println(" Reflexive 1 :" + testEquales.equals(testEquales) + "\n Hash Code :" + testEquales.hashCode());
		
		//System.out.println(" Reflexive 2 :" + testEquales.equals(testEquales1) + "\n Hash Code :" + testEquales1.hashCode());
		
		HashSet<TestEquales> testHashSet = new HashSet<TestEquales>();
		
		for (int i = 0; i<10; i++) {
			TestEquales testEquales2 = new TestEquales(10, "prasanna");
			
			//System.out.println(" Reflexive :" + testEquales.equals(testEquales1) + "\n Hash Code :" + testEquales2.hashCode());
			testHashSet.add(testEquales2);
		}
		
		HashMap<TestEquales, Integer> test = new HashMap<TestEquales, Integer>();
		
		test.put(testEquales, 10);
		test.put(testEquales1, 20);
		
		System.out.println("hash map :"+test.size());
		
		System.out.println(" size of hash set :" + testHashSet.size());
		
		
		int a=10;
		int b=30;
		
		System.out.println(" size of hash set 1:" + testHashSet.size());
		
		System.out.println("add res:" + a+b);

	}

}
