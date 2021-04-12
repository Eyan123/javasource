package ch12;

public class StringEx4 {

	public static void main(String[] args) {
	
		String str1 = "abcdefg";
		
		// 포함여부 
		System.out.println(str1.contains("ab"));

		String str2 = "자바 프로그래밍";

		if(str2.contains("자바")) {
			System.out.println("있으셈");
		}else {
			System.out.println("없당");
		}
		
		
	}
}
