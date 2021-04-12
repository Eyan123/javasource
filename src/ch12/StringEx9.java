package ch12;


public class StringEx9 {

	public static void main(String[] args) {
		
		String str1 = "aabbccAABBCCaa";
		String key="aa";
		System.out.println(str1);
		System.out.println("aa를" + stringCount(str1, "aa")+ "개 찾았습니다");
		
		
	}
	
	static int stringCount(String str1, String key) {
		
		int index=0,pos=0,count=0;
		
		while((index=str1.indexOf(key,pos)) != -1) {
			count++;
			pos = index+key.length();
			
		}
		
		return count;		
	}
	
}
