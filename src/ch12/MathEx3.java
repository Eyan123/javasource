package ch12;


public class MathEx3 {
	public static void main(String[] args) {
		
		// 1~3까지 난수를 3개 생성한 뒤 한줄에 출력
		// 같은수가 나올때까지 반복하고 같은수면 성공출력, 프로그램 종료
		
		int[] numbers = new int[3];
		
		while(true) {
			
			for(int i=0; i<numbers.length; i++) {		
				numbers[i] = (int)(Math.random()*3)+1;
				System.out.print(numbers[i]+"\t");
				
				
			}
			System.out.println();
			
			
			for(int i=0; i<numbers.length; i++) {
				if(numbers[i]==numbers[i]) {
					System.out.println(numbers[i]+"번과" + numbers[i]+" 이 같습니다");
				}else {
					System.out.println("실패");
				}
			}
		break;	
		}
		
	}
}
