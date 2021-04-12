package ch8;

public class ChildEx2 {
	public static void main(String[] args) {
		
		Parent parent = new Child();
		method1(parent);
		method2(parent);
		
		Parent parent2 = new Parent();
		method1(parent2);
		method2(parent2);
		
		// 부모의 참조 변수로 접근할수 있는 범위는 Parent 클래스가 가지고 있는 메소드로 제한됨
		// 단 오버라이딩 된 메소드는 자식 클래스의 메소드가 실핼됨
		
		
		parent.method1(); // 부모 메소드
		parent.method2(); // 내 메소드
		//child.method3(); // 내 메소드
				
	}
	// instanceof : 레퍼런스가 가리키는 객체가 해당 클래스 타입인지 아닌지 확인
	// 객체레퍼런스 instanceof 클래스타입
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1() - Child 변환 성공");
		}else {
			System.out.println("method1() - Child 변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2() -Child 변환 성공");
	}
	
	
	
}
