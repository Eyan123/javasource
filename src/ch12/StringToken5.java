package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken5 {
	public static void main(String[] args) {

		// 키보드로 문자열 읽어 / 문자로 분리하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력하십쇼 : ");
		String input = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(input, "/");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		
	}

}
