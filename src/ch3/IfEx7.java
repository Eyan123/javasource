package ch3;

public class IfEx7 {
	public static void main(String[] args) {
		// 점수 81~100 이하
		
		int score = (int)(Math.random()*20)+81;
		
		//Math.random()*20 => 0~19
		
		System.out.println("점수 = " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
			}else {
				grade="A";
			}
		}else {
			if(score>=85) {
				grade="B+";
			}else {
				grade="B";
			}
		}
		
		System.out.println("학점 : " + grade);
		
	}
		
}