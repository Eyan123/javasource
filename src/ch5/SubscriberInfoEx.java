package ch5;

public class SubscriberInfoEx {
	public static void main(String[] args) {
		SubscriberInfo person1= new SubscriberInfo();
		SubscriberInfo person2= new SubscriberInfo("이름", "abc123", "112");
		SubscriberInfo person3= new SubscriberInfo("이름2", "abc11", "aa","11345","집");
		
		person1.changePwd("비번임");
		person1.setAddr("서울산다");
		person1.setTel("전화번호 00011");
		
		System.out.println(person1.passward);
		System.out.println(person1.addr);
		System.out.println(person1.tel);
		
		
	}
}
