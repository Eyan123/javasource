package ch11;

public class Account {
	private long balance;

	public Account() {
		super();
	}
	
	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws Exception {
		if(balance < money) {
			//throw new Exception("잔고부족 : "+(money-balance)+ " 부족함");
			throw new BalanceInsufficientException("잔고부족 : "+(money-balance)+ " 부족함");
		}
		balance -= money;
	}
	
	
}
