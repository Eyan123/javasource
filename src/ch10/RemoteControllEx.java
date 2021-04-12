package ch10;

public class RemoteControllEx {
	public static void main(String[] args) {
		RemoteControll remote = new Television();
		remote.trunOn();
		remote.trunOff();
		
		remote = new Audio();
		remote.trunOn();
		remote.setVolume(12);
		remote.trunOff();
		
		//익명구현
		RemoteControll rc = new RemoteControll() {
			
			@Override
			public void trunOn() {
				System.out.println("전원을 킵니다");
			}
			
			@Override
			public void trunOff() {
				System.out.println("전원을 끕니다");
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨 조절" + volume);
			}
		};
		
		rc.setMute(true);
		rc.setVolume(5);
		
	}
}
