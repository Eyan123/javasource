package ch12;

public class ValueEx {
	public static void main(String[] args) {
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		
		Value value3 = value1;
		
		System.out.println(value1==value2);
		
		System.out.println(value1.equals(value2));
		//System.out.println(value1.equals(value3));
		
		
	}
}
