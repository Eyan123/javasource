package ch2;

public class Pencil {
	public static void main(String[] args) {
		//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때
		//학생 당 몇 개를 가질 수 있고, 최종적으로 몇개가 남는지 출력
		//변수명은 임의로 
		
		int pencil = 534;
		int s = 30;
		
		int result = pencil / s;
		int remainder = pencil % result;  
		
		
		System.out.println(result);
		System.out.println(remainder);
		
		
	}
	
}
