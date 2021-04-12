package ch11;

public class CathOrderEx {
	public static void main(String[] args) {
		
//	try {
//		String data1 = args[0];
//		String data2 = args[1];
//		System.out.println("data1 = " +data1);
//		System.out.println("data2 = " +data2);
//		
//	} catch (Exception e) {
//		//e.printStackTrace();
//		System.out.println(e.getMessage());
//	}
		
	try {
		
	} finally {
		
	}
	
	try {
		
		String data1 = args[0];
		String data2 = args[1];
		int op1 = Integer.parseInt(data1);
		int op2 = Integer.parseInt(data2);
		System.out.println(op1 + op2);
		
	} catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	} catch (NumberFormatException e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("여긴 무조건 실행");
	}
	
	
		
	}
}
