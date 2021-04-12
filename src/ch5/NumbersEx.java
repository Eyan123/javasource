package ch5;

public class NumbersEx {
	public static void main(String[] args) {
		
		
		int[] arr= {24,34,34,11,22,44,55};
		System.out.println(arr);
		System.out.println(arr.length);
		
		Numbers obj = new Numbers(arr);
		System.out.println("합계 : "+obj.getTotal());
		System.out.println("평균 : "+obj.getAverage());
		
	}
}
