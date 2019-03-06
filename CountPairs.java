package com.pickurtrail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 2, 3, 3, 1 };
		int arr1[] = { 1, 2, 3 };

		// sort the array first
		customeSort(arr);
		List<Integer> list = new ArrayList<Integer>();
		for (int t : arr) {
			list.add(t);
		}
		Set<Integer> set = new HashSet<>(list);
		Integer[] arr3 = new Integer[set.size()];
		int i = 0;
		for (Integer x : set)
			arr3[i++] = x;

		int n = 2; // n is based on diff pair will print
		coutPair(arr3, n);

	}

	private static void coutPair(Integer[] arrs, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrs.length; i++) {
			for (int j = i + 1; j < arrs.length; j++) {
				if ((arrs[i] - arrs[j] == n) || (arrs[j] - arrs[i] == n)) {
					System.out.println("pairs here (" + arrs[i] + "," + arrs[j] + ")");
				}
			}
		}
	}

	private static void customeSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

	}

}
