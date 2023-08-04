package practice.submit02;

import java.util.Scanner;

public class Result02 {
	public static void main(String[] args) {
		// Q.01 점수 입력 후 평균계산하여 출력 
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력해 주세요");
//		System.out.println(">>> ");
//		String name = scanner.nextLine();
//		System.out.println("국어 점수를 입력해 주세요");
//		System.out.println(">>> ");
//		int kor = Integer.parseInt(scanner.nextLine());
//		System.out.println("영어 점수를 입력해 주세요");
//		System.out.println(">>> ");
//		int eng = Integer.parseInt(scanner.nextLine());
//		System.out.println("수학 점수를 입력해 주세요");
//		System.out.println(">>> ");
//		int math = Integer.parseInt(scanner.nextLine());
//		
//		System.out.println("이름: " + name);
//		System.out.println("국어: " + kor);
//		System.out.println("영어: " + eng);
//		System.out.println("수학: " + math);
//		
//		double avg = (kor + eng + math) / 3.0;
//		System.out.printf("평균: %.2f", avg);
//		System.out.println();
//		
//		String grade = (avg >= 90) ? ("A") : ((avg >= 80 ? ("B"):("C")));
//		System.out.println("등급:" + grade);
		
		//Q.02 삼항연산자를 이용해서 주민번호 뒷자리 첫번째 숫자에 대한 성별 출력
		String idBack = "2231476";
		String first = idBack.substring(0, 1);
		int num = Integer.parseInt(first);
		String gender = (num % 2 == 0) ? ("여자") : ("남자");
		System.out.println(gender);
		
		
		
		
		
		
	}
}
