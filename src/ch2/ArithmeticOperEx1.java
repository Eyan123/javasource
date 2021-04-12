package ch2;

public class ArithmeticOperEx1 {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1+v2;
		System.out.println(result1);
		
		int result2 = v1-v2;
		System.out.println(result2);
		
		int result3 = v1*v2;
		System.out.println(result3);
		
		int result4 = v1/v2;  //몫만 가져감
		System.out.println(result4);
		
		int result5 = v1%v2;  //나머지만 가져감
		System.out.println(result5);
		
		double result6 = v1/v2; // 결과값만 바꾼다고 원하는 값을 얻을수 없음
		System.out.println(result6);
		
		double result7 = (double)v1/v2;
		System.out.println(result7);
		
	}
}
