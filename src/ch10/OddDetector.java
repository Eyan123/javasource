package ch10;

public abstract class OddDetector {
	
	int n;
	
	public OddDetector(int n) {
		this.n = n;
	}
	
	int getN() {
		return n;
	}
	
	public abstract boolean isOdd();
	
	
}
