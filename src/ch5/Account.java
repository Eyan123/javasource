package ch5;

public class Account {
	//은행계좌 클래스
	//속성 - 계좌번호(1002-547-966187), 이름(ㅎㅎ), 잔액
	
	String accountNum;
	String name;
	int balance;
	
	//생성자 - 기본 생성자, 인자를 받는 생성자(속성 모두를 초기화)
	
//	Account() {}
//	
//	Account(String accountNum, String name, int balance) {
//		this.accountNum = accountNum;
//		this.name = name;
//		this.balance = balance;
//	}
	
	public Account() {
		super();
	}
	
	public Account(String accountNum, String name, int balance) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}

	

	
	//기능(동작) - 입금한다. 출금한다
	
	//입금한다
	
	void deposit(int amount) {
		balance +=amount;
	}
	
	//출금한다
	
	int withdraw(int amount) {
		return balance -=amount;
	}
	
	
	
}
