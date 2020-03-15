package com.bitwise;

public class MultiDiv {

	static int multiplyWith4(int n) 
	{ 
	    // 2 :- 0010  =>  (n << 1)  => 0100 =>(n << 1) => 1000  (2 * 4 = 8)
	    // 1 :- 0001  =>  (n << 1)  => 0010 =>(n << 1) => 0100  (1 * 4 = 4)
		// 3 :- 0011  =>  (n << 1)  => 0110 =>(n << 1) => 1100  (3 * 4 = 12)
	    return (n << 2); 
	}
	
	static int multiplyBy2(int n) 
	{ 
	    // 2 :- 0010  =>  (n << 1)  => 0100 => (2 * 4 = 8)
	    // 1 :- 0001  =>  (n << 1)  => 0010 => (1 * 4 = 4)
		// 3 :- 0011  =>  (n << 1)  => 0110 => (3 * 4 = 12)
	    return (n << 3); 
	}
	
	static int divisionBy2(int n) 
	{ 
	    // 2 :- 0010  =>  (n << 1)  => 0100 => (2 * 4 = 8)
	    // 1 :- 0001  =>  (n << 1)  => 0010 => (1 * 4 = 4)
		// 3 :- 0011  =>  (n << 1)  => 0110 => (3 * 4 = 12)
	    return (n >> 1); 
	}
	
	static int multiplyTen(int n) 
	{ 
		// n*(2+8) = n*2 + n*8
		// . So n*10 = n<<1 + n<<3.
	    return (n<<1) + (n<<3); 
	} 
	
	static long multiplyByFifteen(long n) 
	{ 
		/**1. method 
		 left shift the number by 4 bits which is equal to (16 * N) 
		 then subtract the original number N from the shifted number i.e. 
		 ((16 * N) – N) which is equal to 15 * N
		**/
		
		long prod = (n << 4); 
		  
	    // ((16 * n) - n) = 15 * n 
	    prod = prod - n; 
	  
	    //return prod; 
		
		/**2. Method 
		 * We can also calculate the multiplication 
		 * (15 * N) as sum of (8 * N) + (4 * N) + (2 * N) + N
		 *  which can be obtained by performing left shift operations 
		 *  as (8 * N) = (N << 3), (4 * N) = (n << 2) and (2 * N) = (n << 1).
		 */
		    long prod2 = (n << 3); 
		    prod2 += (n << 2); 
		    prod2 += (n << 1); 
		    prod2 += n; 
		  
		    // (8 * n) + (4 * n) + (2 * n) + n = (15 * n) 
		    return prod2; 
		    
		    //(((n >> 3) << 3) == n)  
		    // 10000 => (n >> 3) 00100 
		    // 00100 => 10000  == 10000
		    //10001 => 00100
		    //00100 => 10000  = 10001
		    // 11000 => (n >> 3) 00110
		    // 00110 => 11000
		    // 100 => (n>>2) 001
		    // 001 => (n<<2) 100 
	} 
	
	static boolean DivBy8(int n) 
	{ 
		/**
		* n = 16 given so binary of the 16 is 10000 now we shift the 3 bit right, 
		* now we have 00010 so again we shift the 3 bit left, then we have 10000 
		* now compare with the given number first 16==16 in binary so it true so the number 
		* is divisible by 8
		
			(((n >> 3) << 3) == n)  
		     10000 => (n >> 3) 00100 
		     00100 => 10000  == 10000
		     10001 => 00100
		     00100 => 10000  = 10001
		     11000 => (n >> 3) 00110
		     00110 => 11000
		     100 => (n>>2) 001
		     001 => (n<<2) 100 
	     * 
	     */
	    return (((n >> 3) << 3) == n); 
	} 
	
	public static void main(String[] args) {
		
		
		System.out.println(" 2 multiple of 2 :" +MultiDiv.multiplyBy2(2));
		System.out.println(" 1 multiple of 2 :" +MultiDiv.multiplyBy2(1));
		System.out.println(" 3 multiple of 2 :" +MultiDiv.multiplyBy2(3));
		System.out.println(" 10 multiple of 2 :" +MultiDiv.multiplyBy2(10));
		System.out.println("******************************");
		System.out.println(" 2 division of 2 :" +MultiDiv.divisionBy2(2));
		System.out.println(" 1 division of 2 :" +MultiDiv.divisionBy2(1));
		System.out.println(" 3 division of 2 :" +MultiDiv.divisionBy2(3));
		System.out.println(" 10 division of 2 :" +MultiDiv.divisionBy2(10));
		System.out.println("******************************");
		System.out.println(" 2 multiple of 4 :" +MultiDiv.multiplyWith4(2));
		System.out.println(" 1 multiple of 4 :" +MultiDiv.multiplyWith4(1));
		System.out.println(" 3 multiple of 4 :" +MultiDiv.multiplyWith4(3));
		System.out.println(" 10 multiple of 4 :" +MultiDiv.multiplyWith4(10));
		System.out.println("******************************");
		System.out.println(" 2 multiple of 10 :" +MultiDiv.multiplyTen(2));
		System.out.println(" 1 multiple of 10 :" +MultiDiv.multiplyTen(1));
		System.out.println(" 3 multiple of 10 :" +MultiDiv.multiplyTen(3));
		System.out.println(" 10 multiple of 10 :" +MultiDiv.multiplyTen(10));
		System.out.println("******************************");
		System.out.println(" 2 multiple of 15 :" +MultiDiv.multiplyByFifteen(2));
		System.out.println(" 1 multiple of 15 :" +MultiDiv.multiplyByFifteen(1));
		System.out.println(" 3 multiple of 15 :" +MultiDiv.multiplyByFifteen(3));
		System.out.println(" 10 multiple of 15 :" +MultiDiv.multiplyByFifteen(10));
		
		

	}

}
