package ch3;

import java.util.Scanner;

public class ContinueEx3 {
	public static void main(String[] args) {
		int menu=0, num=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("(1) 원하는 메뉴를 선택 종료는 0");
			
			menu = sc.nextInt();
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			}else if(!(1<=menu && menu <=3)) {
				System.out.println("메뉴를 다시 선택해주세요");
				continue;
			}
			System.out.println("선택한 메뉴는" +menu + "번");
		}
	}
}
