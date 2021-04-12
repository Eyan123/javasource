package ch7;

public class CrditLineAccountEx {
	public static void main(String[] args) {
		
		CreditLineAccount obj = new CreditLineAccount("123", "무야호", 20000, 10000000);
		
		System.out.println(obj.withdraw(5000000));
		
	}
}
