package ch5;

public class TV {

	// 속성 	
	// 색상
	
	
	String color;
	boolean power;
	int channel;
	
	TV() {
		
	}
	
	TV(String color) {
		this.color = color;
	}
	TV(String color,boolean power) {
		this.color = color;
		this.power = power;
	}
	TV(String color,boolean power,int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
	
	
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
