package ch7;
public class DmbCellPhone2 extends CellPhone {
	int channel;
	
	
	
	public DmbCellPhone2(String model, String color, int channel) {
		super(); // 부모의 기본 생성자를 호출
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void trunOnDmb() {
		System.out.println("채널" + channel + "번 DBM 방송 시작");
	}
	
	void changeChannelDbm(int channel) {
		this.channel = channel;
		System.out.println("채널" +channel+"번 으로 변경");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}
	
}
