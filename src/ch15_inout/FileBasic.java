package ch15_inout;

import java.io.File;
import java.util.ArrayList;

import org.w3c.dom.html.HTMLFieldSetElement;

public class FileBasic {
	public static void main(String[] args) {
		// 현재 디렉토리 경로가져오기
		String path = System.getProperty("user.dir");
		System.out.println(path);
		// 경로 파일리스트 출력
		File currentFile = new File(path+"/src");
		File[] files = currentFile.listFiles();
		for(int i = 0 ; i < files.length; i++) {
			//경로가 포함되어있는 파일명
			System.out.println(files[i]);
			//파일명만 출력
			System.out.println(files[i].getName());
		}
		// 폴더인지 체크 
		System.out.println(files[0].isDirectory()); //폴더면 true
		// 파일인지 체크 
		System.out.println(files[0].isFile());      //파일이면면 true
		// 파일크기 
		File thisFile = new File(path+"/src/ch15_inout/FileBasic.java");
		System.out.println(thisFile.exists()); // 존재하는지 
		System.out.println(thisFile.length()); // 파일크기는 Byte 
		                                       // 1kb(1024byte)
		
		// mkdir 폴더만들기 
		File test = new File("c:/dev/" + "test");
		test.mkdir();
		ArrayList<String> students = new ArrayList<>();
		students.add("김규영");
		students.add("김동현");
		students.add("김상준");
		students.add("김성운");
		students.add("김세준");
		students.add("노윤기");
		for(int i =0 ; i < students.size(); i ++) {
			File f = new File("c:/dev/" + students.get(i));
//			f.mkdir(); 폴더생성 
			f.delete(); //
		}
		
		
		
		
		
		
		
		
	}
}
