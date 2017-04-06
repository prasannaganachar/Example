import com.overloadoverride.ClassA;
import com.overloadoverride.ClassB;


public class Test {

	public class A{};
	public class B{};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA a = new ClassB();
		
		String sa = new String("abc");
		String sa1 = "oddly";
		
		/*System.out.println(" String Value :" + (sa.equals(sa1)) + " Has 1" + sa.hashCode() + " Has 2" + sa1.hashCode());
		
		System.out.println("val "+a.getValue() + " code" + a.hashCode());
		
		ClassB a1 = new ClassB();
		
		System.out.println("val "+a1.getValue() + " code" + a1.hashCode());
		
		System.out.println("int val "+a1.b);*/
		
		System.out.println(" length :"+sa1.length());
		
		System.out.println(" length :"+sa1.substring(sa1.length()-3));
		
		System.out.println(" 10 vale "+Math.abs(+10.5678999999));
		
		System.out.println(" 10 vale "+(Math.abs(200 - 211) <=10));
		
		System.out.println(" 10 vale "+(Math.abs(10 - 9) ));
		
		char s = "prasanna".charAt(1);
		
		System.out.println(" char at "+ "prasanna".charAt(1));
		
		System.out.println(" mod vale " + 12%10);
		
		

	}

}
