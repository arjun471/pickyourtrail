/**
 * 
 */
package com.pickurtrail;

import java.util.Scanner;

/**
 * @author Nagarjuna
 *
 */
public class SuperStack {
	static int arr[] = null;
	static int i = -1;
	static int size = 0;
	static int intialCapacity = 10;
	static {
		arr = new int[intialCapacity];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(4);
		pop();
		push(3);
		push(5);
		push(2);
		inc(3, 1);
		pop();
		push(1);
		inc(2, 2);
		push(4);
		pop();
		pop();
	}

	private static void inc(int j, int k) {
		// TODO Auto-generated method stub
		for (int g = 0; g < j; g++) {
			arr[g] = arr[g] + k;
		}
		/*
		 * for(int h=0 ; h<size;h++){ System.out.println("h::"+arr[h]); }
		 */

	}

	private static void pop() {
		// System.out.println("pop ::: "+arr[i--]);
		size--;
		int o = arr[i--];
		peek();
	}

	private static void push(int stkval) {
		// TODO Auto-generated method stub
		// System.out.println("push ::: "+stkval);
		size++;
		if (!isStackFull()) {
			arr[++i] = stkval;
			peek();
		} else {
			System.out.println("stack is full ::");
		}

	}

	private static void peek() {
		// TODO Auto-generated method stub
		int siz = size - 1;
		if (siz == -1) {
			System.out.println("Stack is EMPTY");
		} else {
			int peak = arr[siz];
			System.out.println("peak ::: " + peak);
		}
	}

	private static boolean isStackFull() {
		// TODO Auto-generated method stub
		if (arr.length == size+1) {
			int oldcap = arr.length;
			int newcap = oldcap + (oldcap >> 1);
			intialCapacity = newcap ;
			return true;
		} else {
			return false;
		}
	}

}
