package ch1;

public class CastingEx2 {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		
		//float : 부호(1비트) + 지수(8비트) + 가수(23비트)
		float num3 = num2;
		
//		double num3 = num2;
		System.out.println("num3 = " + num3);
		num2 = (int)num3;
		
		int result = num1 - num2 ;
		System.out.println(result);
	}

}
