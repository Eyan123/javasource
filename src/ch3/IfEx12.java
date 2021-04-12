package ch3;

import java.util.Scanner;

public class IfEx12 {
	public static void main(String[] args) {
		//사용자로부터 키와 몸무게를 입력받고 
		// 표준체중 계산후 , 많으면 과체중 적으면 저체중 동일하면 표준
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("키 입력 : ");
		int height = sc.nextInt();
		System.out.print("몸무게 입력 : ");
		int weight = sc.nextInt();
		
		int standard = (int)((height-100)*0.9);
		
		if(weight>standard) {
			System.out.println("과체중");
		}else if(weight==standard) {
			System.out.println("표준체중");
		}else {
			System.out.println("저체중");
		}
		
		
 	}
}
