package practice.submit03;

import java.util.Scanner;

public class Result03 {
	public static void main(String[] args) {
		/*
		 * Q. 01
				사용자로부터 국어, 영어, 수학 점수를 각각 입력받아 평균점수를 구하고, 등급을
				출력해주세요.
				등급조건: 평균점수가 90점 이상이면 A, 80점 이상 B, 70점 이상 C, 나머지 D
		 * */
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("국어 점수를 입력해주세요 >> ");
//		String korean = scan.nextLine();
//		System.out.print("영어 점수를 입력해주세요 >> ");
//		String english = scan.nextLine();
//		System.out.print("수학 점수를 입력해주세요 >> ");
//		String math = scan.nextLine();
//		
//		int intKor = Integer.parseInt(korean);
//		int intEng = Integer.parseInt(english);
//		int intMath = Integer.parseInt(math);
//		
//		double average = (intKor + intEng + intMath) / 3.0;
//		System.out.println("평균 : " + average);
//		
//		if(average >= 90) {
//			System.out.println("A 등급");
//		}else if(average >= 80) {
//			System.out.println("B 등급");
//		}else if(average >= 70) {
//			System.out.println("C 등급");
//		}else {
//			System.out.println("D 등급");
//		}
		
		System.out.println("\n==================================\n");
		/*
		 * Q. 02
			팩토리얼 다들 기억하시나요?
			수학기호로 4! 는 4 팩토리얼을 의미하며,
			그 값은 4x3x2x1 = 24 입니다.
			for문을 사용해서 10팩토리얼의 값을 출력해주세요.
			결과: 3628800
			@ 15 팩토리얼의 값을 출력해주세요.
			결과: 1307674368000
			
			// 1x2x3x4x5x6x7x8x9x10
		 * */
		// 팩토리얼
		long result = 1;
		for(int i=1; i<=15; i++) {
			result *=i;
		}
		System.out.println(result);
		
		/*
		 * Q. 03
			월리를 찾아라!!
			String findWally =
			“윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리”;
			위의 문자열 변수 findWally 중에 월리가 몇개 들어있는지 콘솔에 출력해주세요.
			결과: 5
		 * */
		String findWally ="윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int all = findWally.length();
		int after = findWally.replaceAll("월리", "").length();
		System.out.println((all - after)/2);
		// 
		int count = 0;
		for(int i=0; i < findWally.length()-1; i++) {
			String subWally = findWally.substring(i, i+2);
			if(subWally.equals("월리")) {
				count +=1;
			}
		}
		System.out.println("월리는 총:" +  count);	
		/*
		 * Q. 04 거꾸로 트리를 5층 만들어주세요.
			실행 결과
			*****
			****
			***
			**
			*
		 * */
		String star= "*****";
		for(int i = 5; i > 0 ; i--) {
			String subStar = star.substring(0,i);
			System.out.println(subStar);
		}
		for(int i = 0; i < 5 ; i++) {
			System.out.println(star.substring(i));
		}
		
		
	}
}
