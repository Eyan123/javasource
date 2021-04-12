package ch9;

public class Cat extends Animal {

	
	
	
	public Cat() {
		super();
		this.kind = "표유류";
	}

	@Override
	void sound() {
		System.out.println("야옹");
	}

}
