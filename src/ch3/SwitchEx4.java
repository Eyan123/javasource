package ch3;

public class SwitchEx4 {
	public static void main(String[] args) {
		// 8 ~ 11 정추 추출
		int time = (int)(Math.random()*4)+8;
		
		switch(time) {
		
		case 8 :
		System.out.println("출근");
		
		case 9 : 
		System.out.println("회의 진행");
		
		case 10 : 
		System.out.println("업무 진행");
		
		default :
		System.out.println("외근");
		}
		
		//break 문이 없으면 시작 시점부터 아래로 쭉 내려감
		
		
	}
}
