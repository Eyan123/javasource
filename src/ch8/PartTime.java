package ch8;

public class PartTime extends Employee{
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+ "파트타이머일합니다");
	}
}
