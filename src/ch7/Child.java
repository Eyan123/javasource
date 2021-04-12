package ch7;

public class Child extends Parent {
	
	String field2;
	
	@Override
	public void method2() {
		System.out.println("Child-method2() 재정의함 ㅎㅎ");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
