package ch13_ArrayList;

import java.util.Arrays;

public class ArrayEx5 {
	public static void main(String[] args) {
		
		char[] arr1 = {'ㅎ','ㅅ','ㄱ','ㄴ','ㅈ','ㄷ','ㅁ','ㄹ','ㅊ'};
		
		
		//정렬전
		
		for(char c : arr1) {
			System.out.print(c+"\t");
		}
		
		System.out.println();
		
		Arrays.sort(arr1);
		
		for(char c : arr1) {
			System.out.print(c+"\t");
		}
		
	}
}
