package com.bitwise;

public class BitWiseXORO {

	
	static int findOdd(int arr[], int n) 
	{ 
	    int res = 0; 
	    for (int i = 0; i < n; i++) 
	        res ^= arr[i]; 
	    return res; 
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,3,5};
		System.out.println("odd number: "+BitWiseXORO.findOdd(arr,arr.length));

	}

}
