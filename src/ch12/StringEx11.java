package ch12;


public class StringEx11 {

	public static void main(String[] args) {
		
		StringBuilder builder1 = new StringBuilder("hello");
		StringBuilder builder2 = new StringBuilder("hello");
		
		//System.out.println(builder1.equals(builder2));
		
		String str1 = builder1.toString();
		String str2 = builder1.toString();
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(builder1.equals(builder2)); // false
		
		// insert, delete, replace => 문자열 변경시 유용
		
		StringBuilder sb1 = new StringBuilder("Java ");
		sb1.append("Programming");
		System.out.println(sb1);
		
		sb1.insert(4, " Test ");
		System.out.println("insert 후 : " +sb1);
		
		sb1.replace(6, 10, " Book ");
		System.out.println("replace 후 : " +sb1);
		
		StringBuilder sb2 = new StringBuilder("abcdefg");
		sb2.delete(0, 3);
		System.out.println(sb2);
		
		sb2.deleteCharAt(0);
		System.out.println(sb2);
		
		
	}	
}
