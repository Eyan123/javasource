package ch10;

public class Odd extends OddDetector {

	public Odd(int n) {
		super(n);
	}

	@Override
	public boolean isOdd() {
		if (super.n % 2 == 0) {
			System.out.println(super.n);
			System.out.println("홀수가 아닙니다");
			return false;
		} else {
			System.out.println("홀수입니다");
			return true;
		}
	}

}
