package ch3;

public class ForEx13 {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d\t", i,j,i*j);
			}
		}
	}
}
