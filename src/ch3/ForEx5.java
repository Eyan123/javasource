package ch3;

public class ForEx5 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		
		System.out.println("\n");
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}