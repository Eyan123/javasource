package ch5;

public class StudentEx {
	public static void main(String[] args) {
		// 객체 생성
		
		Student student = new Student();
		
		// 초기화
		student.name = "홍길동";
		student.id = "20170012";
		student.mobile = "010-2568-4568";
		student.addr = "서울시 강남구";
		
		System.out.println("학번 : " +student.id);
		System.out.println("이름 : " +student.name);
		System.out.println("주소 : " +student.addr);
		System.out.println("전화번호 : "+ student.mobile);
		
		student.changeMobile("010-5555-1234");
		System.out.println("전화번호 변경 : "+ student.mobile );
	}
}
