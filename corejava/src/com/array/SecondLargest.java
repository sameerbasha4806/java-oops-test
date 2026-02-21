package com.array;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]={12, 35, 1, 10, 34, 1};
		int secondLargest=arr[0];
		int firstLargest=arr[0];		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>firstLargest) {
				firstLargest=arr[i];
			}		
	}
//		System.out.println(firstLargest);
		 for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != firstLargest) {
	                if (secondLargest == firstLargest || arr[i] > secondLargest) {
	                    secondLargest = arr[i];
	                }
	            }

  }
		 System.out.println(secondLargest);
}
}