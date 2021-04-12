package ch5;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account("111-111-111", "에바", 10000);
		
		account.deposit(20000);
		
		System.out.println(account.balance);
		
		account.withdraw(15000);
		
		System.out.println(account.balance);
		
	}
}
