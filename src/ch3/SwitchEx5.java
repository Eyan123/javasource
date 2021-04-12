package ch3;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {

		// 가위(1) 바위(2) 보(3)
		// 컴퓨터는 Math.random 추출
		// 승자 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("가위(1) 바위(2) 보(3) 입력 : ");

		int player = sc.nextInt();

		int com = (int) (Math.random() * 3) + 1;
		
		System.out.println(com);

		switch (player) {

		case 1:

			if (com == 1) {
				System.out.println("비겼습니다");
			} else if (com == 2) {
				System.out.println("졌습니다");
			} else if (com == 3) {
				System.out.println("이겼습니다");
			}

			break;

		case 2:

			if (com == 1) {
				System.out.println("이겼습니다");
			} else if (com == 2) {
				System.out.println("비겼습니다");
			} else if (com == 3) {
				System.out.println("졌습니다");
			}

			break;

		case 3:

			if (com == 1) {
				System.out.println("졌습니다");
			} else if (com == 2) {
				System.out.println("이겼습니다");
			} else if (com == 3) {
				System.out.println("비겼습니다");
			}

			break;

		}

	}
}
