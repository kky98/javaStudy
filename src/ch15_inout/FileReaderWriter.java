package ch15_inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileReaderWriter {
	public static void main(String[] args) {
		//FileReader, Writer는 문자기반 , Stream은 바이트기반.
		String path = System.getProperty("user.dir");
		FileReader reader= null;
		FileWriter writer = null;
		try {
			reader = new FileReader(path + "/delay.txt");
			writer = new FileWriter(path + "/delay_backup.txt");
			char[] data = new char[16]; // 한번에 16개의 문자를 읽어오겠다.
			while(true) {
				int x = reader.read(data);
				if(x == -1) {
					System.out.println("파일에 끝에 도달함.");
					break;
				}
				writer.write(data, 0, x);
			}
			writer.flush(); // 남아있는게 없도록 비워줌
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(writer != null) writer.close();
					if(reader != null) reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		} 
		
	}
}
