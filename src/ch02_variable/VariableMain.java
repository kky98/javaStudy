package ch02_variable;


public class VariableMain {
	
	public static void main(String[] args) {
/*
 *  객체 지향 프로그래밍 
 *  객체 : 데이터(속성)과 그 데이터를 조작하는 방법(메서드)를 함께 캡슐화한 것을 가르킴.
 *  객체는 실제 세계의 물체나 개념을 모델링하는데 사용됨.
 *  예를 들어 "자동차" 라는 객체를 만든다면 
 *  그 속성으로는 색상, 브랜드, 최대 속도 .. 이 올수 있고 
 *  메서드로는 가속, 정지, 방향 전환과 같은 동작이 포함될 수 있음.
 *  
 *  객체는 클래스라는 "틀"을 바탕으로 생성됨. 
 *  클래스는 객체의 구조와 동작을 정의하며, 동일한 유형의 여러 객체들이 동일한 클래스를 
 *  공유할 수 있음. 
 *  객체 지향 프로그래밍의 핵심적인 장점은 코드의 재사용성과 확장성을 증가시키는 것.
 *  잘 설계하면 동일한 유형의 새로운 객체를 쉽게 생성하고, 기존 객체를 재사용하거나 
 *  확장하여 프로그램의 복잡성을 관리할 수 있음. 
 * 
 * */
		
		int myMoney;     // 변수 선언 
		myMoney = 10000; // 값 할당 
		System.out.println(myMoney);
		
		int myAge = 20;  // 변수 초기화(initialization =init)
		                 // 초기화 동시에 값 할당
		System.out.println(myAge);
		
		myMoney = 20000;    // 수정
		System.out.println(myMoney); 
		
		//상수(Constant)의 선언 
		//값이 변경되면 안되는 
		final double MATH_PI = 3.14;  //상수는 대문자로 많이 사용
		System.out.println(MATH_PI);
		//MATH_PI = 3.22;  오류남 
		
		System.out.println("======= String 내장 메소드 =========");
		String fruits ="Apple, Banana, Cherry";
		// string.length() <-- 해당 문자열의 길이를 리턴 
		int len = fruits.length();
		System.out.println("fruits 길이는:" + len);
		// string.charAt(인덱스)
		// 인덱스는 위치를 의미함 
		// 0 부터 시작 
		char alpha = fruits.charAt(3);
		System.out.println(alpha); // A p p l  
		
		// string.indexOf(문자열) 
		// 해당 문자열의 인덱스 리턴 
		System.out.println(fruits.indexOf("Banana"));
		System.out.println(fruits.indexOf("banana")); // 존재하지 않으면 -1
		
		// string.substring(시작인덱스, 끝 인덱스) 
		// 해당 문자열을 시작 인덱스부터 끝인덱스 전까지 자름.
		System.out.println(fruits.substring(7, 13));
		// string.substring(시작인덱스) 입력값이 1개만 들어오면 
		// 시작인덱스부터 끝까지 자름
		System.out.println(fruits.substring(15));
		
		// string.replace(바뀔 문자, 바꾸고 싶은 문자)
		System.out.println(fruits.replace("Cherry", "pizza"));
		String world ="     The   New   World!!    ";
		System.out.println(world.replace("  ", ""));
		
		
		
		
	}
}
