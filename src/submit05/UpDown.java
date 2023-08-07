package practice.submit05;

import java.awt.print.Printable;
import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		// 1~50 사이의 랜덤한 수를 5번 안에 맞춰야하는 
		// 업다운 게임을 만들어보세요.
		// q.01
		int randInt = (int) (Math.random() * 50 + 1);
		Scanner scanner = new Scanner(System.in);
		int chance = 5;
		while(true) {
			System.out.println("숫자를 입력해주세요 :");
			int userPick = Integer.parseInt(scanner.nextLine());
			if(userPick == randInt) {
				System.out.println("정답입니다.!!!!");
				break;
			}
			chance -= 1;
			if(chance <=0) {
				System.out.println("실패하였습니다.... 정답은 " +randInt + "입니다..");
				break;
			}
			if(userPick < randInt) {
				System.out.println("업!!! 기회가 " + chance + "남았습니다.");
			}else if(userPick > randInt) {
				System.out.println("다운!! 기회가 " + chance + "남았습니다.");
			}
		}
		scanner.close();
		for(int i=4 ; i >= 0; i--) {
			System.out.println("기회가 " + i + " 남았습니다." );
		}
		
	}
}
