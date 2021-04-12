package ch3;

import java.util.Scanner;

public class ScannerEx4 {
	public static void main(String[] args) {
		
		//System.out : 화면
		//System.in : 키보드
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		
		int op1 = Integer.parseInt(sc.nextLine());
		
		// 인트로 파싱
		
		System.out.print("연산자 + 입력 : ");
		
		String str = sc.nextLine();
		
		System.out.print("두번째 수 입력 : ");
		
		int op2 = Integer.parseInt(sc.nextLine());
		
		System.out.printf("%d %s %d",op1,str,op2);
	}
}
