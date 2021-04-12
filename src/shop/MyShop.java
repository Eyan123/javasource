package shop;

import java.util.Scanner;

public class MyShop implements IShop {

	private String title;

	Scanner sc = new Scanner(System.in);

	// 제품 배열
	Product[] products = new Product[5];

	// 장바구니 배열
	Product[] carts = new Product[5];

	User[] users = new User[2];

	String selUser;

	String select;

	boolean run = true;

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// user 2명 생성
		users[0] = new User("김김김", PayType.CARD);
		users[1] = new User("박박박", PayType.CASH);

//		for(int i=0; i<users.length; i++) {
//			users[i] = new User("유저"+i, PayType.CARD);
//		}

	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("갤럭시", 900000, "SKT");
		products[1] = new SmartTV("샘숭 스마트 TV", 1000000, "4K");
		products[2] = new CellPhone("아이펀", 800000, "애플");
		products[3] = new CellPhone("샤오미", 350000, "샤오미");
		products[4] = new SmartTV("엘쥐 스마트 TV", 350000, "2K");

	}

	@Override
	public void start() {

		System.out.println(title + " : 메인 화면 - 계정 선택");
		System.out.println("============================");
		for (int i = 0; i < users.length; i++) {
			// System.out.println("["+i+"]"+users[i].getName()+" "+users[i].getPayType());
			System.out.printf("[%d]%s(%s) \n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x]종 료");
		System.out.print("선택 : ");
		select = sc.nextLine();

		// 사용자가 0,1을 입력, x를 입력하면 종료 , 예외값을 입력하면 메뉴를 확인해주세요

		if (select.equals("0") || select.equals("1")) {
			selUser = select;
			System.out.println("## " + select + "선택 ##");
			productList();
		} else if (select.equals("x") || select.equals("X")) {
			System.out.println("프로그램 종료");
			System.exit(0);
		} else {
			System.out.println("\n메뉴를 확인해주세요\n");
			start();
		}

	}

	public void productList() {
		System.out.println();
		System.out.println(title + " 상품 목록 - 상품 선택");
		System.out.println("============================");

		for (int i = 0; i < products.length; i++) {
			System.out.print("[" + i + "]");
			products[i].printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		String select = sc.nextLine();

		// h : 메인화면, c : checkOut() 메소드, 상품번호 : 선택상품 장바구니 담기 & 상품목록 화면으로 돌아감

		switch (select) {
		case "h":
			start();
			break;

		case "c":
			checkOut();
			break;
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":

			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(select)];
					System.out.println(products[Integer.parseInt(select)].getPname() + " 상품을 구입하였습니다");
					break;
				}
			}
			productList();
			break;

		default:
			System.out.println("\n번호를 확인해주세요\n");
			productList();
			break;
		}

	}

	public void checkOut() {
		// 장바구니 출력
		System.out.println(" ## c선택 ## ");
		System.out.println(title + " : 체크아웃");
		System.out.println("=========================");

		int sum = 0;

		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d] %s (%d)\n", i, carts[i].getPname(), carts[i].getPrice());
				sum += carts[i].getPrice();
			}
		}

		System.out.println("=========================");
		System.out.println("결제 방법 : " + users[Integer.parseInt(selUser)].getPayType());
		System.out.println("합계 : " + sum + " 원 입니다");
		System.out.println("[p] 이전, [q]결제 완료");
		System.out.print("선택 : ");
		String select = sc.nextLine();

		if (select.equals("p")) {
			productList();
		} else if (select.equals("q")) {
			System.out.println("결제가 완료되었습니다 종료합니다");
			System.exit(0);
		} else {
			System.out.println("입력값을 확인해주세요");
			checkOut();
		}
	}

}
