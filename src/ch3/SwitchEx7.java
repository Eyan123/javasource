package ch3;

import java.util.Scanner;

public class SwitchEx7 {
	public static void main(String[] args) {

		// 사용자에게 점수 입력받기
		// 해당 점수에 따라 A~F 등급 출력
		// 90점 이상 A, 80점이상 B, 70점 이상 C 나머지 F

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 : ");
		int score = sc.nextInt()/10;

		switch(score) {
			
		case 9 : 
			System.out.println("A등급");
			
		break;
		
		}
		
	}
}
