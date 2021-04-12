package ch7;

public class TV2 {
	
	String color;
	boolean power;
	int channel;
	
	
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

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
