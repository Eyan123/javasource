package ch5;

public class Student2Ex {
	public static void main(String[] args) {
		//Student2 객체 생성 > 기본생성자를 통해서 
		
		Student2 stu1 = new Student2();
		Student2 stu2 = new Student2("1234", "동훈쿤", "서울", "010");
	
		//초기화
		
		System.out.println(stu2);
	}
}
