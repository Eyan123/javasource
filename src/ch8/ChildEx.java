package ch8;

public class ChildEx {
	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		// 부모의 참조 변수로 접근할수 있는 범위는 Parent 클래스가 가지고 있는 메소드로 제한됨
		// 단 오버라이딩 된 메소드는 자식 클래스의 메소드가 실핼됨
		
		
		parent.method1(); // 부모 메소드
		parent.method2(); // 내 메소드
		//child.method3(); // 내 메소드
		
		//강제 형변환
		Child child = (Child) parent;
		child.method3();
		
		//ClassCastException
		Parent p1 = new Parent();
		child = (Child) p1;
		
	}
	
	
}
