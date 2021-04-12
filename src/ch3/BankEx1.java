package ch3;

import java.util.Scanner;

public class BankEx1 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-------------------------");
			System.out.print("선택 >> ");
			
			// 1번 예금액 입력받기
			// 잔액 = 잔액 + 예금
			
			// 2번 : 출금액 입력받기
			// 잔액 = 잔액 - 출금
			
			// 3번 : 현재까지의 잔액 출력
			
			// 4번 프로그램 종료
			
			int selcet = sc.nextInt();
			
			switch(selcet) {
				
			case 1: 
				
				System.out.print("예금 금액 입력 : ");
				int y = sc.nextInt(); 
				balance=+y;
				System.out.println("현 잔액은 = " + balance);
				
				break;
			}
			
		}
	}
}
