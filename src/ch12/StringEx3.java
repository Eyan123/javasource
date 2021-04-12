package ch12;

public class StringEx3 {

	public static void main(String[] args) {
	
		String str1 = "자바 프로그래밍";
		
		// indexOf():: 매개변수로 주어진 문자열이 시작되는 인덱스 리턴 
		
//		System.out.println(str1.indexOf("자바")); // 0
//		System.out.println(str1.indexOf("베이직")); // -1
//		System.out.println(str1.indexOf("그")); // 5

		String str2 = "Hello";
		
		System.out.println(str2.indexOf('o'));
		System.out.println(str2.indexOf("e1",2));
		
		String str3 = "HelloHelloHello World";
		System.out.println("l 문자 위치 : " + str3.indexOf('l'));
		System.out.println("l 문자 위치 : " + str3.lastIndexOf('l'));
		
		
//		if(str1.indexOf("프") >= 0 ) {
//			System.out.println("있음");
//		}else {
//			System.out.println("없다");
//		}
//		
		
	}
}
