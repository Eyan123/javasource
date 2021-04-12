package ch10;

public class IPTV extends ColorTV {

	private String ip;
	
	public IPTV(int size, int color, String ip) {
		super(size, color);
		this.ip = ip;
	}
	
	@Override
	IPTV printProperty() {
		System.out.println("나의 IPTV는 " +ip +"주소의 " + this.getSize() + "인치 " + this.getColor()+ "컬러");
		return this;
	}
	
}
