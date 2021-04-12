package ch3;

public class ForEx2 {
	public static void main(String[] args) {
		// 1~10까지 합
		
		int sum1 = 0;
		
		int sum2 = 0;
		
		for(int i=1; i<11; i++) {
			sum1+=i;
		}
		
		System.out.println(sum1);
		
		for(int i=1; i<=100; i++) {
			sum2 = sum2+i;
			// 짧게 코드 짜기(동일변수 줄임)
			
		}
		
		System.out.println(sum2);
		
	}
	
}
