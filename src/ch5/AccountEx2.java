package ch5;

public class AccountEx2 {
	public static void main(String[] args) {
		Account account = new Account("111-111-111", "에바", 10000);
		
		//입금한다.
		account.deposit(20000);
		accountPrint(account);
		
		//출금한다.
		account.withdraw(15000);
		accountPrint(account);
		
		Account account1 = new Account("123-41-124","김김김",500);
		
		//입금한다.
		account1.deposit(30000);
		accountPrint(account1);
		
		account1.withdraw(1000);
		accountPrint(account1);
	}
	
	static void accountPrint(Account account) {
		System.out.println(account.name + "잔액 : " + account.balance);
	}
	
}
