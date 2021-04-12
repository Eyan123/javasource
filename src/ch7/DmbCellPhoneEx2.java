package ch7;

public class DmbCellPhoneEx2 {
	public static void main(String[] args) {
		
		DmbCellPhone2 dmb = new DmbCellPhone2("자바","검정",7);
				
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
