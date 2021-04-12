package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQ1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> score = new ArrayList<String>(); 
		
		System.out.print("학점을 입력해주세요 : ");
		score.add(sc.nextLine());
		
		
		
		System.out.println(score);
		
		
		
	}
}
