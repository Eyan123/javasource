package ch8;

public class LgTV {
	
	SamsungSpeaker speaker;
	
	
	public LgTV(SamsungSpeaker speaker) {
		super();
		this.speaker = speaker;
	}

	void powerOn() {
		System.out.println("전원켬 ");
	}
	
	void powerOff() {
		System.out.println("전원끔 ");
	}
	
}
