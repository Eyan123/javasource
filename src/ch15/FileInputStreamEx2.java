package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

public class FileInputStreamEx2 {

	public static void main(String[] args) {

		File f = new File("c:\\temp\\file1.txt");
		try (FileInputStream fis = new FileInputStream(f); 
				OutputStream out = System.out) {

			byte[] b = new byte[100];
			while (fis.read(b) != -1) {
				out.write(b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
