package ch7;

public class BonusPointAccount extends Account{
	
	private int bonusPoint;
	
	
	public BonusPointAccount
	(String ano, String owner, int balance, int bonusPoint) {
		super(ano, owner, balance);
		this.bonusPoint = bonusPoint;
	}


	public int getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	@Override
	void deposit(int amount) {
		
		bonusPoint += amount / 100;
		
		System.out.println("보너포인트는 =" + bonusPoint);
		
		super.deposit(amount);
	}
	
	
	
	
	
}
