package ch8;

public class Ceo extends Employee{
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+ "일합니다");
	}
}
