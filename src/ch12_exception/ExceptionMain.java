package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		System.out.println("메인 시작");
		int[] intArr = { 1, 2, 3 };
		try {
			System.out.println(intArr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 문제!!! 사이즈에 맞게 사용하세요!!");
			e.printStackTrace();
		} catch (Exception e) {
			// printStackTrace 오류 출력
			e.printStackTrace();
			System.err.println("오류났어!!!");
			System.out.println("오류 났을때 처리구간");
		}
		System.out.println("메인 종료");

		try {
			System.out.println(ExMethod.dateMillSec("2023.07.12"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(ExMethod.dateMillSec2("2023.07.12"));

		try {
//			ExMethod.printName("");
			ExMethod.printName("길");
		} catch (BizException e) {
			System.out.println(e.getErrCode());
			System.out.println(e.getMessage());
		}
	}

}
