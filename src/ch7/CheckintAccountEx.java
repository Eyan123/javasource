package ch7;

public class CheckintAccountEx {
	public static void main(String[] args) {
		CheckingAccount obj = 
				new CheckingAccount("111-11", "무야호", 1000, "123-123");
		
		obj.deposit(10000);
		
		System.out.println(obj.getBalance());
		
		// 체크카드 사용
		
		obj.pay("11111111111", 1000000);
		
		System.out.println(obj.pay("123-123", 11000));
		
		
	}
}
