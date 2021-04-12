package ch3;

public class ForEx8 {
	public static void main(String[] args) {
		// 1~100까지 정수중 3의 배수만을 더하기
		// 9의 배수는 제외
		// 나는 수학을 못해(몰라ㅋㅋ) 
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%9!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
