package ch10;

public class ColorTVEx {
	public static void main(String[] args) {
		
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		
		IPTV myTV1 = new IPTV(32, 2048, "192.1.1.2"); 
		myTV1.printProperty();
		
	}
}
