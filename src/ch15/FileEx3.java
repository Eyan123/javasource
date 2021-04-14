package ch15;

import java.io.File;

public class FileEx3 {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("사용법 : java FileEx3 디렉토리명");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if(!f.exists() || !f.isDirectory()) { 
			// exists : 존재한다면 true, 하지않으면 false , isDirectory : 이게 디렉토리가 맞는지 아닌지 
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		// listFiles : 디렉토리 안에 있는 파일목록을 배열로 받아옴
		
		for(int i=0; i<files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory()?"["+fileName+"]":fileName);
		}
		
	}
}
