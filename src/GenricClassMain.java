import com.overloadoverride.ClassA;
import com.overloadoverride.ClassB;


public class GenricClassMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenricClass<Integer> gn = new GenricClass<Integer>();
		
		gn.setValue(20);
		
		System.out.println("Val: "+gn.getValue());
		
		
GenricClass<String> gn1 = new GenricClass<String>();
		
		gn1.setValue("2dssdfds0");
		
		System.out.println("Val: "+gn1.getValue());
		
		ClassA b = new ClassB();
		
		//System.out.println(" val :"+b.getValue());
	}

}
