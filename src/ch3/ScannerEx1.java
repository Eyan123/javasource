package ch3;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		
		//System.out : 화면
		//System.in : 키보드
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		// nextInt() : 값을 읽엉올때 공백(기본)을 기준으로 읽어옴
		
		int num = sc.nextInt();
		
		System.out.println(num);
	}
}
