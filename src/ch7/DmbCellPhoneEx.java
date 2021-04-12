package ch7;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone();
		
		dmb.model = "자바폰";
		dmb.color = "black";
		dmb.channel = 7;
		
		dmb.powerOn();
		dmb.trunOnDmb();
		dmb.changeChannelDbm(8);
		dmb.turnOffDmb();
		dmb.bell();
		dmb.sendVoice("무야호");
		dmb.receiveVoice("애미야 국이짜다");
		dmb.hangUp();
	}
}
