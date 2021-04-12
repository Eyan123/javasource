package ch4;

public class ArrayEx8 {
	public static void main(String[] args) {
		
		int scores[] = {79,88,91,33,100,55,95};
		
		// 최대값 최소값 구하기
		
		int max = scores[0];
		int min = scores[0];
		
		for(int score : scores) {
			if(max<score) {
				max = score;	
			}else if(min>score ) {
				min = score;
			}
		}
		
		System.out.println("최대값 : " +max);
		System.out.println("최소값 : " +min);
	}
}
