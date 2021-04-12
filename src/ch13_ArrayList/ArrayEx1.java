package ch13_ArrayList;

import java.util.Arrays;

public class ArrayEx1 {
	public static void main(String[] args) {
		
		char[] arr1 = {'H','a','p','p','y'};
		
		char[] arr2 = new char[10];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		System.out.println(arr2);
		
		char[] arr3 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(arr3);
		
		
	}
}
