package ch6;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		super();
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setHour(int hour) {
		if(hour<0 || hour>23)
			return;
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute <0 || minute > 59)
			return;
		this.minute = minute;
	}
	
	public void setSeconed(int seconed) {
		if(second < 0 || second >59 ) {
			return;
		}
		this.second = seconed;
	}

	public int getSecond() {
		return second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}
	
	
	
}
