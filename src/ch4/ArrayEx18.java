package ch4;

import java.util.Scanner;

public class ArrayEx18 {
	public static void main(String[] args) {
		// 학생들의 점수를 받아서 최고 점 및 평균 점수 구하기
		
		// 몇 명의 학생? => 입력을 받음
		
		int scores[] = null;
		
		int studentNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요 : ");
		
		studentNum = sc.nextInt();
		
		scores = new int[studentNum];
		// 변수명만 적어서 값을 입력
		
		
//		for(int score : scores) {
//			
//		}
		
		for(int i=0; i<scores.length; i++) {
			System.out.print("점수 입력 : ");
			int score = scores[i] = sc.nextInt();
			System.out.println(score + "점 입력되었습니다");
						
		}
		
		
		
		
	}
}
