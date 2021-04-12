package ch3;

import java.util.Scanner;

public class IfEx9 {
	public static void main(String[] args) {
		// 시간당 급여 계산 출력
		// 시간 급여 5000 근무 시간 입력받기 
		// 근무시간 8시간 초과시 원래 임금의 1.5배 
		
		System.out.println("근무시간을 입력해주세요 : ");
		
		Scanner sc = new Scanner(System.in); 
		
		int time = sc.nextInt();
		
		int rate = 5000;
		
		int pay = 0;
		
		if(time>8) {
			pay = (int)(rate*(time-8)*1.5) + rate*8; 
		}else {
			pay = rate * time;
		}
		
		System.out.println("임금 : " + pay);
		
//		if(time <= 8) {
//			System.out.println("급여는" + m*time + "입니다");
//		} 
//		
//		if(time > 9) {
//			
//		}
//		
	}
}
