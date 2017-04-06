
public class ReverseNumber {
	
	public static void revers(int n) {
		System.out.print("val:"+ n%10);
		
		if(n/10 == 0)
			return;
		
		revers(n/10);
	}
	 public static void main(String args[]){
	  int sampleNum = 12345678;
	  System.out.println("Input Num : "+sampleNum);
	  int reversedNum = 0;
	  while(sampleNum!=0){
		  System.out.println("samNo:"+sampleNum);
		  System.out.println("revNo:"+reversedNum);
	   reversedNum = reversedNum*10 + sampleNum%10;
	   sampleNum = sampleNum/10;
	  }
	  System.out.println("Reversed Num : "+reversedNum);
	  
	  revers(12345678);
	 }
	/*private static void revers(int sampleNum) {
		// TODO Auto-generated method stub
		
	}*/
	}