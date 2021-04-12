package ch5;

public class Circle {
	//속성 : 반지름 
	
	double radius;
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	//기능 : 면적을 구한다(반지름*반지름*3.14)
	
	double area() {
		return this.radius*this.radius*3.14;
	}
	
}
