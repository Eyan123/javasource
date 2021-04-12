package ch6;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArr = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		int select = 0;
		
		
		while(run) {
			
			System.out.println("1.계좌생성||2.계좌목록||3.예금||4.출금||5.종료");
			System.out.print("번호를 입력하세요  : ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			
				
			case 1 :
				createAccount();
				break;			
			case 2 : 
				accountList();
				break;
			case 3: 
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5 : 
				run = false;
				break;
			}
		}
		
	}
	
	static void createAccount() {
				
		System.out.print("계좌번호 입력 : ");
		String ano = sc.nextLine();
		
		System.out.print("계좌주 입력 : ");
		String owner = sc.nextLine();
		
		System.out.print("잔액 입력 : ");
		int balance = Integer.parseInt(sc.nextLine());
			
		for(int i=0; i<accountArr.length; i++) {
			if(accountArr[i]==null) {
				accountArr[i] = new Account(ano, owner, balance);
				System.out.println("계좌 생성 완료");
				break;
			}
		}
	}
	
	static void accountList() {
		
		for(Account ac : accountArr) {
			
			if(ac!=null) {
				System.out.println("계좌번호 : " +ac.getAno());
				System.out.println("계좌주 : " +ac.getOwner());
				System.out.println("잔액 : " +ac.getBalance());
				System.out.println();
			}
		}
	}
	
	static void deposit() {
		
		System.out.print("계좌번호를 입력해주세요 : ");
		String ano = sc.nextLine();
		
		Account account = findAccount(ano);
		
		if(account != null) {
			System.out.print("입금액 : ");
			int money = Integer.parseInt(sc.nextLine());
			account.setBalance(account.getBalance() + money);
			System.out.println("잔액은 = " + account.getBalance());
		}else {
			System.out.println("계좌번호를 확인해주세요");
		}
		
			
	}
	
	static void withdraw() {
	
		System.out.print("계좌번호 입력 : ");
		String ano = sc.nextLine();
		
		Account account = findAccount(ano);
		
		if(account != null) {
			System.out.print("출금액 입력 : ");
			int money = Integer.parseInt(sc.nextLine());
			
			if(account.getBalance() >= money) {
				account.setBalance(account.getBalance()-money);
				System.out.println("잔액은 : " +account.getBalance());
			}else {
				System.out.println("잔액을 초과했습니다");
			}	
			
		}else {
			System.out.println("계좌번호를 확인해주세요");
		}
		
	}
	
	static Account findAccount(String ano) {
		
		Account findAcc = null;
		
		for(Account account : accountArr) {
			if(account != null) {
				if(account.getAno().equals(ano)) {
					findAcc = account;
				}
			}
		}
		return findAcc;
	}
	
	
}
