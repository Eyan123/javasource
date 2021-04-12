package ch5;

public class Triangle {
	
	//속성 - 밑변, 높이 
		
	int baseLine;
	int height;
	
	Triangle(int baseLine, int height) {
		this.baseLine = baseLine;
		this.height = height;
	}
	
	//기능 - 면적구하기
	
	double getArea() {
		return baseLine*height/2;
	}
	
}
