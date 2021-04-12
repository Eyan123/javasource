package ch13_ArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx4 {
	public static void main(String[] args) {
		String[] arr = {"good", "height", "apple", "piano", "zero"};
		
		//정렬전
		
		for(String str : arr) {
			System.out.print(str+"\t");
		}
		
		System.out.println();
		
		//오름차순 정렬
		Arrays.sort(arr);
		
		for(String str : arr) {
			System.out.print(str+"\t");
		}
		
		System.out.println();
		
		//내림차순 정렬
		Arrays.sort(arr, Comparator.reverseOrder());
		
		for(String str : arr) {
			System.out.print(str+"\t");
		}
		
	}
}
