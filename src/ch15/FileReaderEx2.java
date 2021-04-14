package ch15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderEx2 {
	public static void main(String[] args) {
		// Reader / Writer => 문자 단위
		// InputStream / OutputStream => 바이트 단위
		
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			reader = new FileReader("c:\\temp\\file1.txt", Charset.forName("ms949"));
			writer = new FileWriter("c:\\temp\\출력물.txt");
			
			char[] ch = new char[1024];
			while(reader.read(ch)!=-1) {
				writer.write(ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
