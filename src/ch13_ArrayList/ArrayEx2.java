package ch13_ArrayList;

import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		int arr[] = {37,21,56,99,88,58,62,15,36,78};
		
		//정렬전
		
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		//정렬
		Arrays.sort(arr);
		
		//정렬후
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		
	}
}
