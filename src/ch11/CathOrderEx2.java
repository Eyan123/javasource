package ch11;

public class CathOrderEx2 {
	public static void main(String[] args) {
		
		try {	
			String data1 = args[0];
			String data2 = args[1];
			int op1 = Integer.parseInt(data1);
			int op2 = Integer.parseInt(data2);
			System.out.println(op1 + op2);
		}
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("매개인자의 개수를 확인, 숫자로 변환 가능한지 확인");
		} 
		finally {
			System.out.println("여긴 무조건 실행");
		}
	}
}
