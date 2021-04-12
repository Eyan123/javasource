package ch4;

public class ArrayEx3 {
	public static void main(String[] args) {
		int score[] = {1,2,3,4,5};
		String name[] = {"a","b","c","d","e","f"};

//		for(int i=0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}
		
		for(int s:score) {
			System.out.println(s);
		}
		
		for(String a:name) {
			System.out.println(a);
		}
		
		
	}
}
