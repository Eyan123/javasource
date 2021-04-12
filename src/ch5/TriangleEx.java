package ch5;

public class TriangleEx {
	public static void main(String[] args) {
		
		// 밑변이 10, 높이 8 삼각형 객체 생성
		
		Triangle tri = new Triangle(10, 8);
		
		// 면적 구하기
		System.out.println("삼각형 면적 : " +tri.getArea());
	}
}
