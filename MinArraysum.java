/**
 * 
 */
package com.pickurtrail;

/**
 * @author Nagarjuna
 *
 */
public class MinArraysum {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,2,2 };
		int n = 2000;
		int element =3000;
		
		arr = getMinimumUniqueSum(arr, n,element);
		int sum=sumOfArrayValues(arr);
		System.out.println("sum :::"+sum);
	}

	private static int[] getMinimumUniqueSum(int[] arr, int n,int element) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length && i < n; i++) { // check length should be 2000;
			for (int j = i + 1; j < arr.length; j++) {
					if(arr[i]==arr[j]){
					//System.out.println("i" + j);
					incrementDuplval(arr,j,element); // find duplicate and increment val
				}
			}
		}
		return arr;
	}

	private static void incrementDuplval(int[] arr, int j, int element) {
		// TODO Auto-generated method stub
		int g =1 ;
		for (int k = 0; k < arr.length && k < element;) {
			if (arr[k] == g) { 
				g++;
				k = 0;
			} else {
				k++; // increase the values when it doesnt match
			}
		}
		System.out.println(g);
		arr[j] = g;
	}
	
	private static int sumOfArrayValues(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		return sum;
	}

}
