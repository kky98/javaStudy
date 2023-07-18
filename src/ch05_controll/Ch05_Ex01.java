package ch05_controll;

import java.util.Scanner;

public class Ch05_Ex01 {
	public static void main(String[] args) {
		// 사용자로 부터 숫자를 입력받고, 해당 숫자가 짝수인지 홀수인지 판별하는 프로그램을 작성하시오.
		// 정수만 입력받는 상황.
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.println(">>> ");
		int num = scanner.nextInt();
		if( num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		}else {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		
		scanner.close();
	}
}
