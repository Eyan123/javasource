package ch12;

public class StringEx6 {

	public static void main(String[] args) {
	
		String ssn = "880815-1234567";
		
		//subString(시작위치, 끝나는 위치) : 문자열 추출
		System.out.println(ssn.substring(0,6));
		System.out.println(ssn.substring(7));
		
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(10.5));
		System.out.println(String.valueOf(12));
		System.out.println(String.valueOf('c'));
		
		String str1 = String.join("-", "java", "is", "cool");
		System.out.println(str1);
		
		String str2 = "aaa";
		String str3 = "bbb";
		String str4 = "ccc";

		System.out.println(str2.compareTo(str3));
		System.out.println(str3.compareTo(str2));
		
		System.out.println(str2.compareTo(str4));
		
		//toUpperCase, toLowerCase : 대소문자 변환
		String str5= "abcdefg";
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase());
		
		//trim()
		String str7 = "   ABC      dsfs     ";
		System.out.println(str7);
		System.out.println(str7.trim());
		
	}
}
