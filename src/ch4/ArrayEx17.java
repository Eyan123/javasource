package ch4;

import java.util.Scanner;

public class ArrayEx17 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------");
			System.out.print("선택 > ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo==1) {
				
				System.out.print("학생수를 입력 : ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				
				
			}else if(selectNo==2) {
				
//				for(int i=0; i<scores.length; i++) {
//					System.out.print("점수입력 : ");
//					scores[i] =  sc.nextInt();
//				}
				
				for(int score : scores) {
					System.out.print("점수입력 : ");
					scores[score] =  sc.nextInt();
				}
				
			}else if(selectNo==3) {
				
				for(int s : scores) {
					
					System.out.println("나옴" + s);
				}
				
			}else if(selectNo==4) {
				
				// 최대값, 평균 구하기
				
				int max = 0;
				int total = 0;
				
				for(int score : scores) {
					if(max < score) {
						max = score;
					}
				}
				System.out.println("최대값은 : " + max);
				
				for(int score : scores) {
					total += score; 
				}
				
				System.out.println("평균값은 : " +total/scores.length);
				
			}else if(selectNo==5) {
				run=false;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
