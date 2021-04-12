package ch13_ArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx7 {
	public static void main(String[] args) {
		
		Character arr[] = {'a','q','c','r','z','o','b','f','g','s'};
		
		//정렬전
		
		for(Character i : arr) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		//정렬 - 내림차순
		Arrays.sort(arr, Comparator.reverseOrder());
		
		//정렬후
		for(Character i : arr) {
			System.out.print(i + "\t");
		}
		
	}
}
