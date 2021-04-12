package ch5;

public class TvEx {
	public static void main(String[] args) {
		// 객체 생성
		TV tv = new TV();
		
		tv.color = "red";
		tv.power = true;
		tv.channel = 7;
		
		tv.channelUp();
		//tv.channelDown();
		
		// 
		System.out.println(tv.color);
		System.out.println(tv.power);
		System.out.println(tv.channel);
	}
}
