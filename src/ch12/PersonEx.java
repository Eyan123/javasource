package ch12;

public class PersonEx {

	public static void main(String[] args) {
	
		Person p1 = new Person("id", "이름");
		Person p2 = new Person("id", "이름");
		Person p3 = new Person("id", "네임");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		System.out.println(p1.toString());
		
	}
	
}
