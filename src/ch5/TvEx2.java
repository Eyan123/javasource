package ch5;

public class TvEx2 {
	public static void main(String[] args) {
		// 객체 생성
		TV tv = new TV();
		
		tv.color = "red";
		tv.power = true;
		tv.channel = 7;
		tv.channelUp();
		print(tv);
		
		TV tv2 = new TV("white");
		print(tv2);
		
		TV tv3 = new TV("black", true);
		print(tv3);
		
		TV tv4 = new TV("blue", true, 11);
		print(tv4);
		
	}
	
	public static void print(TV tv) {
		System.out.println(tv.color);
		System.out.println(tv.power);
		System.out.println(tv.channel);
		System.out.println();
	}
	
}
