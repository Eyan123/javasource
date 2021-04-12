package ch11;

public class AccountEx {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(100000);
		
		try {
			account.withdraw(1000000);
		} catch (BalanceInsufficientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
