package ch7;

public class ComputerEx {
	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("Calculator원 면적 : " + calculator.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println("Computer원 면적 : " + com.areaCircle(r));
		
	}
}
