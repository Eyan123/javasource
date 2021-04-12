package ch3;

import java.util.Scanner;

public class ForEx10 {
	public static void main(String[] args) {
		// 임의의정수 입력받아 해당 수의 팩토리얼 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int num = sc.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
			fact = fact * i; 
		}
		
		System.out.println(num + "! = " +fact);
		
	}
}
