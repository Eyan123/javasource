package ch10;


// 추상클래스보다 추상화 정도가 높음 => 추상메소드와 상수만 가질수있음
// 다른 클래스를 작성하는데 도움을 주는 목적
// 모든 메서드는 public abstract 이어야 하며 생략 가능
// 모든 멤버변수는 public static final 이어야 하며 생략 가능 

public interface Account {
	static final int SPADE = 4;
	abstract void test();
	void print();
	
	
	
	
}
