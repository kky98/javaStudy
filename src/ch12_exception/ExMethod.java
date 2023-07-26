package ch12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExMethod {
	// 날짜 문자열을 입력으로 받아 밀리초로 바꿔주는 메소드    
	// throws 는 메소드 호출 쪽에서 처리하도록 오류가나면 호출쪽으로 전달 
	public static long dateMillSec(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp = sdf.parse(date);
		return temp.getTime();
	}
	public static long dateMillSec2(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp;
		Long result = 0l;
		try {
			temp = sdf.parse(date);
			result = temp.getTime(); 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	// 입력받은 이름을 콘솔에 출력하는 메소드 
	// 만약 입력이 없으면 exception 처리 만약 1자리이면 exception 
	// 사용자 정의 예외 처리
	// 코드상 오류는 아니지만 해당 업무에서 오류로 보는 상황에 대한 예외처리 방법 
	public static void printName(String nm ) throws BizException {
		if(nm.length() == 0) {
			throw new BizException("001", "이름에 empty 가 들어옴");
		}else if(nm.length() == 1) {
			throw new BizException("002","외자는 안됨!!!");
		}
	}
}
