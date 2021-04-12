package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken6 {
	public static void main(String[] args) {

	// 문자열 입력받아 공백으로 분리된 어절이 몇개인지 출력
	// exit 입력이면 종료
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
//		while(true) {
//			
//			System.out.print("입력하십쇼 : ");
//			String input = sc.nextLine();
//			System.out.println(input);
//			StringTokenizer token = new StringTokenizer(input);
//			
//			if(input.equals("exit")) {
//				break;
//			}else {
//				while(token.hasMoreTokens()) {
//					token.nextToken();
//					count++;
//				}
//				
//			if(count > 0) {
//				System.out.println(count);
//				count = 0;
//			}
//				
//			}	
//		}	
		
		
	    while(true) {
	    	System.out.print("입력하십쇼 : ");
	    	String input = sc.nextLine();
	    	if(!input.equals("exit")) {
	    		StringTokenizer token=new StringTokenizer(input);
	    		System.out.println("분리된 어절수 : " +token.countTokens());
	    	}else {
	    		System.out.println("프로그램 종료");
	    		break;
	    	}
	    }
		
		
		
		
	}
}
