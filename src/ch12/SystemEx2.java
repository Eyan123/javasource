package ch12;

public class SystemEx2 {
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		long sum=0;
		for(int i=1; i<10000000; i++) {
			sum+=i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("1~10,000,000 까지 합 :" +sum);
		System.out.println("1~10,000,000 까지 더하는데 걸린 시간 :" +(end-start));
		
	}
}
