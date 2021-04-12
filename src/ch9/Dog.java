package ch9;

public class Dog extends Animal {
	
	public Dog() {
		super();
		this.kind = "표유류";
	}

	@Override
	void sound() {
		System.out.println("멍멍");
	}

}
