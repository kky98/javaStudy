package ch15_inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Diary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 // 날짜 포맷 정의
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 현재 날짜와 시간을 문자열로 변환
        String currentDate = sdf.format(new Date());
		String filePath = "diary.txt";
		File file = new File(filePath);
		try {
			FileOutputStream fos= new FileOutputStream(file, true);
			fos.write((currentDate +" 의 일기\n").getBytes());
			while(true) {
				System.out.println("오늘의 일기를 작성하세요. exit 를 입력하면 종료됩니다.");
				String msg = sc.nextLine();
				if("exit".equalsIgnoreCase(msg)) {
					System.out.println("종료합니다. ");
					break;
				}
				fos.write((msg +"\n").getBytes());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
 	}
}
