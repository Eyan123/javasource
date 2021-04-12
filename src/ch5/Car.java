package ch5;

public class Car {
	//속성(필드) : 제조사(현대)/모델(스포티지)/색상(red)/최고속도(200)
	
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//기능(동작) : 전진한다/후진한다.
	
	public Car() {}
	
	// 생성자는 여러개 올 수 있음(생성자 오버로딩)
	
	public Car(String company) {
		this.company = company;
	}
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
		
	}
	public Car(String company, String model, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	
	void forward() {
		System.out.println("전진.");
	}
	
	void backword() {
		System.out.println("후진");
	}
	
}
