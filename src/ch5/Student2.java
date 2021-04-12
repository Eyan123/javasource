package ch5;

public class Student2 {
	
/*  클래스	
//	클래스명의 시작은 숫자x
//	$,_ 외의 특수문자는 사용x
//	자바 키워드는 사용할수 없음
//  대문자로 시작(관례)
 *  카멜케이스 ex) ChatServer 
*/
	
//  속성 - 학번,이름,주소 => 필드(맴버변수,프로퍼티)
	
	private String id; // 학번
	private String name; // 이름
	private String addr; 
	private String mobile;
	
	
	
	
	// 생성자 - 클래스명 동일
	// 개발자가 명시적으로 생성자를 선언하지 않으면 컴파일러가 알아서 만들어줌
	
	public Student2() {}
	
	public Student2(String id, String name, String addr, String mobile) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.mobile = mobile;
	}
	
	// 기능 - 폰번호 변경, 주소변경 > 메소드
	
	void changeMobile(String change) {
		this.mobile = change;
	}
	
	void changeAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
}
