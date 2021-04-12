package ch3;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		
		//System.out : 화면
		//System.in : 키보드
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		
		// nextLine() : \n을 기준으로 읽어옴
		
		//String str = sc.nextLine();
		
		String str = sc.next();
		
		// next() : 공백을 기준으로 읽어옴
		
		System.out.println(str);
	}
}
