package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx3 {

	public static void main(String[] args) {

		File f = new File("c:\\temp\\file1.txt");
		try (FileInputStream fis = new FileInputStream(f);
				FileOutputStream out = new FileOutputStream("c:\\temp\\test20.txt")) {
			
			byte[] b = new byte[100];
			while (fis.read(b) != -1) {
				out.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
