package practice.submit04;

import java.util.Scanner;

public class Result04 {
	public static void main(String[] args) {
		//Q.1
		//룰렛을 아주 힘차게 돌렸더니 5834도가 돌아갔다고 합니다.
		//한바퀴는 당연히 360도 겠죠?
		System.out.println((5834 / 360) + "바퀴");
		int angle = 5834 % 360; 
		System.out.println(angle);
		
		// Q.2 
		// 로꾸꺼
		Scanner scanner = new Scanner(System.in);
		System.out.println("단어를 입력하시오:");
		String inputText = scanner.nextLine();
		String reverse ="";
		for(int i= inputText.length(); i > 0 ; i--) {
			reverse += inputText.substring(i - 1, i);
		}
		System.out.println("로꾸꺼: "+ reverse);
		
		// Q.3 트리 
		// 1. 5번 반복 
		// 2. 별 1, 3, 5, 7, 9
		// 3.공백 4, 3, 2, 1, 0  
		String star= "*";
		String blank= "";
		for(int i = 0; i < 5 ; i++) {
			if(i > 0 ) {
				star += "**";
			}
			blank= "";
			for(int j = 1; j < 5-i; j++) {
				blank +=" ";
			}
			System.out.println(blank + star);
		}
		System.out.println("\n================\n");
		// 공백이 0, 1, 2, 3, 4
		// 별이  9, 7, 5, 3, 1
		blank = "";
		for(int i = 0; i < 5; i++) {
			if(i > 0) {
				blank += " ";
			}
			star = "*";
			for(int j = 0; j < 4-i; j++) {
				star += "**";
			}
			System.out.println(blank + star);
		}
		System.out.println("\n==================\n");
		//print사용
		int num = 25;
		for(int i = 0; i < num ; i++) {
			// 공백
			for(int j = num - i ; j > 1 ; j--) {
				System.out.print(" ");
			}
			//별
			for(int j = 0; j <= 2 * i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 다이아몬드 
		for(int i=num-2; i>=0; i--) {
			for(int j= num -i; j >1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
