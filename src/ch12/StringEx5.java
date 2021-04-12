package ch12;

public class StringEx5 {

	public static void main(String[] args) {
	
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		
//		String str2 = str1.replace("자바", "java");
//		
//		System.out.println(str2);
//		
//		System.out.println(str1);
//		
		
		str1 = str1.replaceFirst("java", "자바");
		
		System.out.println(str1);
		
		String str2 = "hello";
		String str3 = "hello";
		String str4 = "Hello";
		
		System.out.println(str2.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str2.equalsIgnoreCase(str4));
		
	}
}
