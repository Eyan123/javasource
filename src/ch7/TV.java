package ch7;

public class TV {

	// 속성 	
	// 색상
	
	
	String color;
	boolean power;
	int channel;
	
	// 동작(메소드)
	// 전원 on/off, 채널변경
	
	void power() {
		power=!power;
	}
	
	void channelUp() {
		channel++; 
	}
	
	void channelDown() {
		channel--;
	}
	
}
