package ch4;

public class ReferenceEx1 {
	public static void main(String[] args) {
//		String strArr[] = new String[3];
		
		// 참조타입 - null할당(힙 영역 객체를 참조하지 않음)
		
		String strArr[] = new String[3];
		
		strArr[0] = "홍길동";
		strArr[1] = "홍길동";
		strArr[2] = new String("홍길동");
		
		System.out.println(strArr[0]==strArr[1]);
		System.out.println(strArr[0]==strArr[2]);
		
		
	}
}
