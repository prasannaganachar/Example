import java.util.HashSet;


public class MainEquals {

	static void StairCase(int n) {

	     for (int i=0;i<=n;i++) {
	         int j;
	         for (j=0;j<n-i;j++) {
	             System.out.print(" ");
	         }
	         for (int k=0;k<n-j;j++) {
	            System.out.print("#");
	         }
	         System.out.println("");
	     }
	    }
	

    static int summation(int[] numbers) {
        int sum=0;
       for (int i=0;i<numbers.length;i++) {
           sum +=numbers[i];
       }
        return sum;

    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Equals1 e1=new Equals1("s", 10);
				//Equals1 e2=new Equals1("s", 10);
				
				//--------------EQUALS--------------------
				// 1. validating CHARACTER inside object.
				// 2.By default its using == operator.
				// 3. if compare object ,need to override equals method in object class (like Person class).
				
				//-----------------(==)-----------------
				// 1. compare two object referance to see whether they are refer the same instance
		
		int rec[] = {1,2,3,4,5};
		System.out.println("Sum valu :" +summation(rec));
				String s1 = new String("Hello");
				String s2 = new String("Hello");
				String s4 = "Hello"; 
				String s3 = "Hello";

				
				System.out.println("s1 equals s2:"+s1.equals(s2)); // TRUE
				
				System.out.println("s1 equals s4:"+s1.equals(s4)); // TRUE
				
				System.out.println("s2 equals s4:"+s2.equals(s4)); // TRUE
				
				System.out.println("s1 == s4:"+(s1==s4)); //False
				
				System.out.println("s1 == s2:"+(s1==s2)); //False		
				
				System.out.println("s3 == s4:"+(s3==s4)); //TRUE
				
				System.out.println("s3 equals s4:"+(s3.equals(s4))); //TRUE
				
				//----------------------WRAPPER CLASS------------------
				
				Integer i = new Integer(10);
				Integer i2 = new Integer(10);
				int i3 = 10;
				int i4 = 10;
				int i5 = 11;
				
				System.out.println("--------------------WRAPPER------------");
				System.out.println("i equals i2:"+ (i.equals(i2))); // TRUE
				System.out.println("i == i2:"+ (i==i2)); // FALSE
				System.out.println("i2 == i3:"+ (i3==i2)); // TRUE
				System.out.println("i4 == i3:"+ (i4==i3)); // TRUE		
				System.out.println("i == i3:"+ (i==i3)); // TRUE
				System.out.println("i2 equals i3:"+ (i2.equals(i3))); // TRUE 
				
				System.out.println("----------Class equals--------------------");
				
				Equals1 e1=new Equals1("test");
				Equals1 e2=new Equals1("test");
				Equals1 e4=new Equals1("test4");
				Equals1 e3=e1;		
				
				
				
				System.out.println("e1 Euals e2:"+e1.equals(e2));  // TRUE
				System.out.println("e1 == e2:"+(e1==e2)); //FALSE
				System.out.println("e3 Euals e2:"+e3.equals(e1)); // TRUE
				System.out.println("e3 == e1:"+(e3==e1)); // TRUE
				System.out.println("e4 Euals e1:"+e4.equals(e1)); // TRUE
				System.out.println("e4 == e1:"+ (e4==e1)); // FALSE
				
				System.out.println("e3 :"+e3.s + " e1 :" +e1.s); //e3 :test4 e1:test4
				
				e3.s="test4";
				System.out.println("e1 Euals e2:"+e1.equals(e2));  // FALSE
				
				
				HashSet<Integer> hs =  new HashSet<Integer>();
				
				for(int j=0;j<=10;j++) {
					hs.add(j);
					System.out.println("remove set:" +hs.remove(j-1));
				}
				System.out.println(" size of hs :"+hs.size());
	}

}
