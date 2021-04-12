package ch3;

public class WhileEx2 {
	public static void main(String[] args) {
		
		//1~10까지 출력
		
		int i = 0;
		
		int sum = 0;
		
		while(i<=10) {
			System.out.println(i+" ");
			sum+=i;
			i++;			
		}
		System.out.println(sum);
	}
}
