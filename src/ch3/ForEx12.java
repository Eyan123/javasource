package ch3;

public class ForEx12 {
	public static void main(String[] args) {
		// 정수 12345를 선언하고 각 자릿수를 더한 결과 출력
		// 왜 이렇게 해야하는지 모르겠음 
		
		
		int num = 12345;
		
		int sum = 0;
		for(; num!=0;) {
			sum += num%10; //5 나머지값
			num = num/10; //12345
		}
		System.out.println(sum);
		
	}
}
