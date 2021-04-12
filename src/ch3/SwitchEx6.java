package ch3;

import java.util.Scanner;

public class SwitchEx6 {
	public static void main(String[] args) {
		
		// 간단 계산기 
		// 사용자에게 두개의 숫자와 연산자 입력받기
		// 입력받은 값에 의해서 계산한 후 출력하기 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쨰 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력해주세요 : ");
		String y = sc.next();
		
		int result;
		
		switch(y) {
		
		case "+" :
			
			result = num1 + num2;
			
			System.out.println("결과는" +  result + "입니다");
			
			break;
		
		}
		
	}
}
