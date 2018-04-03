package com.algorithm;

public class BubbleSort {

	public int [] sortBubble(int []arr) {
		int length = arr.length;
		for (int i=0;i<length-1;i++) {
			for (int j=0; j<length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bubbleSort = new BubbleSort();
		 int arr[] = {64, 34, 25, 12, 22, 11, 90};
		
		 System.out.println("************Before Sort Array******");
		 bubbleSort.printArray(arr);
		 arr = bubbleSort.sortBubble(arr);
		 System.out.println("************After Sort Array******");
		 bubbleSort.printArray(arr);
	}

}
