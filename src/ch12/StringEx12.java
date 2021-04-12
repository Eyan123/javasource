package ch12;


public class StringEx12 {

	public static void main(String[] args) {
		
		String str1 = "AbZquartKgu";
		char[] chArr = str1.toCharArray();
		
		System.out.println(str1.length());
		for(int i=chArr.length-1; i>=0; i--) {
			System.out.print(chArr[i]);
		}
		
		System.out.println();
		
		StringBuffer buffer = new StringBuffer("AbZquartKgu");
		System.out.println(buffer.reverse());
		
	}	
}
