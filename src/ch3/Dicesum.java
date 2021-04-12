package ch3;

public class Dicesum {
	public static void main(String[] args) {
		
		int num1=0 , num2=0;
		
		while(true) {
			
			num1 = (int)((Math.random()*6))+1;
			num2 = (int)((Math.random()*6))+1;
			
			System.out.printf("주사위값은 (%d,%d)\n", num1,num2);
			
			if(num1+num2==5) {
				break;
			}
			
		}
		System.out.println("5가 나옴 ㅊㅊㅊ");
	}
}
