package ch3;

import java.util.Scanner;

public class IfEx8 {

	public static void main(String[] args) {
		// 사용자에게 값을 입력받아 홀,짝 구분
		// if~else 사용

		System.out.print("수를 입력해주세요");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}

	}

}
