package ch5;

public class Physicalinfo {
	//속성 : 이름,나이,키,몸무게
	
	String name;
	int age;
	float height;
	float weight;
	
	
	
	//기능 : 나이변경/ 나이와 키를 변경/ 나이,키,몸무게 변경
	//메소드 오버로딩 : 하나의 클래스 내에 같은 이름의 메소드를 여러개 선언하는것
	// 			    매개변수의 타입, 개수, 순서 중 하나가 달라야한다 
	//오버로딩시 변수의 이름은 전혀 상관없음 타입이 기준(타입이 중요함)
	
	void update(int age) {
		this.age = age;
	}
	void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
}
