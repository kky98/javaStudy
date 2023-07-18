package ch05_controll;

import java.util.Scanner;

public class Ch05_Ex02 {

	public static void main(String[] args) {
//		 메뉴를 입력받아 가격을 출력하는 프로그램을 작성하시오(switch 사용) 
//		 (아이스아메리카노는 호칭이 2개)
//		 아아 or 아이스아메리카노 : 3000
//		 라떼 :4500
//		 에스프레소 :2500 
//		 위의 메뉴로 입력하면 "입력메뉴"는 000원 입니다. 출력 
//		 위의 메뉴가 아닌 메뉴는 
//		 "입력메뉴" 메뉴는 저희 매장에 없습니다.출력
		int salePrice = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴를 주문하세요");
		System.out.println(">>> ");
		String menu = scanner.nextLine();
        switch (menu) {
            case "아아":
            case "아이스 아메리카노":
            	salePrice = 3000;
                break;
            case "바닐라라떼":
            case "바닐라 라떼":
            	salePrice = 4500;
                break;
            case "에스프레소":
            	salePrice = 2500;
                break;
        }
        if(salePrice == 0) {
        	System.out.println(menu +  " 메뉴는 없습니다.");
        }else {
        	System.out.println(menu + "는" + salePrice + "원 입니다.");
        }
        
        
        
		
		
		
				
	}

}

