package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx4 {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("c:\\temp\\바다.jpg"); 
				FileOutputStream out = new FileOutputStream("c:\\temp\\바다복사본.jpg")) {
			byte[] b = new byte[100];
			while(fis.read(b)!=-1) {
				out.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
		
	
	
}
