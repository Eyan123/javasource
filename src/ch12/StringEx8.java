package ch12;

public class StringEx8 {

	public static void main(String[] args) {
		
		int sum=0;
		
		String str="345221"; // 1+2+3+4+5
		
		char[] chArr = str.toCharArray();
			
		for(int i=0; i<str.length(); i++) {
			//sum += str.charAt(i) - '0';
			sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
			
		}
		
		System.out.println(sum);
		
	}
}
