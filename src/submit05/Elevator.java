package practice.submit05;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		// 엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을
		// 눌렀을때, 한 대의 엘리베이터가 이동하는 프로그램 구현
		
		// 1. 사용자의 현재 위치를 Scanner로 입력하면
		//	 사용자의 위치와 더 가까운 엘리베이터가 이동한다.
		// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면
		//	 둘 중 위 층의 엘리베이터가 내려온다.
		// 3. 사용자가 입력한 위치로 엘리베이터의 위치를 바꿔준다.
		// 4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit을 입력
		
		// up 탑승 중인 엘리베이터가 해당 층으로 이동하도록 만들어보기
		
		int elevatorA = 10; // 엘리베이터 A의 위치 
		int elevatorB = 4;  // 엘리베이터 B의 위치 
		Scanner scanner = new Scanner(System.in);
		
		// 움직인 엘리베이터가 A이면 1, B이면 2
		final int ACTIVE_ELEVATOR_A = 1;
		final int ACTIVE_ELEVATOR_B = 2;
		int activeElevator = 0;
		
		while(true) {
			System.out.println("\n ======== 미래융합 엘리베이터 =======\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA);
			System.out.println("승강기 B의 현재 위치: " + elevatorB);
			System.out.println("몇층에 계시나요? [종료하려면 q or exit 입력]: ");
			
			String inputText = scanner.nextLine();
			if(inputText.equalsIgnoreCase("q") || 
					inputText.equalsIgnoreCase("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			// 사용자가 입력한 층수
			int custFloor = Integer.parseInt(inputText);
			System.out.println(custFloor + "층에서 엘리베이터 호출");
			// 사용자의 위치와 각 층수의 차이 계산
			int diffFloorA = (custFloor > elevatorA) ? (custFloor - elevatorA)
					:(elevatorA - custFloor);
			int diffFloorB = Math.abs(custFloor - elevatorB);
			
			// 위치 차이에 따른 엘리베이터 이동
			// A승강기가 더 멀때 			
			if(diffFloorA > diffFloorB) {
				System.out.println("승강기 B가 " + custFloor +"층으로 이동하였습니다.");
				elevatorB = custFloor;
				activeElevator = ACTIVE_ELEVATOR_B;
			// B승강기가 더 멀때
			}else if(diffFloorA < diffFloorB) {
				System.out.println("승강기 A가 " + custFloor +"층으로 이동하였습니다.");
				elevatorA = custFloor;
				activeElevator = ACTIVE_ELEVATOR_A;
			// 같을때
			}else {
				if(elevatorA > elevatorB) {
					System.out.println("승강기 A가 " + custFloor +"층으로 이동하였습니다.");
					elevatorA = custFloor;
					activeElevator = ACTIVE_ELEVATOR_A;
				}else {
					System.out.println("승강기 B가 " + custFloor +"층으로 이동하였습니다.");
					elevatorB = custFloor;
					activeElevator = ACTIVE_ELEVATOR_B;
				}
			}
			
			System.out.println("어느 층으로 이동하시겠습니까? :");
			inputText = scanner.nextLine();
			
			int goToFloor = Integer.parseInt(inputText);
			if(activeElevator == ACTIVE_ELEVATOR_A) {
				System.out.println("승강기 A가 " + goToFloor + "층으로 이동하였습니다.");
				elevatorA = goToFloor;
			}else {
				System.out.println("승강기 B가 " + goToFloor + "층으로 이동하였습니다.");
				elevatorB = goToFloor;
			}
			break;
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
