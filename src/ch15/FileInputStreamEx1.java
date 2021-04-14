package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		
		File f = new File("c:\\temp\\file1.txt");
		
		try (FileInputStream fis = new FileInputStream(f);
				OutputStream out = System.out) {

			int data = 0;
			while ((data = fis.read()) != -1) {
				out.write(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
