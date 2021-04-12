package ch2;

import java.util.Scanner;

public class ConditionalOperEx3 {
	public static void main(String[] args) {
		// 변수 num을 선언한 뒤 양수, 음수, 0인지 출력하시오
		// 변수에는 임의의 값을 부여한다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
//		char grade=(score>90)? 'A' :((score>80)?'B':'C');
		
		String result =(num>0)? "양수" : ((num==0)? "0" : "음수");
		
		System.out.println(result);		
	}
}
