package ch06_Method;
// javadoc 주석 단축키 shift + alt + j 
// 자동 주석 생성 설정 
// window -> preferences -> Java -> Code Style -> Code Templates ->Comments


/**
 * @파일명      :MethodMain.java
 * @프로젝트명   :JavaStudy
 * @작성일      :2023. 7. 21. 
 * @작성자      :leeapgil
 * @프로그램설명  : Q010100
 * @변경이력     :
 */
public class MethodMain {

	/**
	 * @Method Name : main
	 * @작성일       : 2023. 7. 21.
	 * @작성자       : leeapgil
	 * @메소드설명    : main입니다.
	 * @param       :
	 * @return      :
	 */
	public static void main(String[] args) {
		// method(메소드) 클래스에 종속된 함수.
		// java 는 모두 class에 작성되기 때문에 사용되는 함수를 메소드라고 부름.
		// function 은 클래스에 독립적인 함수
		// 1 ~ 100까지 더 하면 결과는?
		// 1 ~ 50 까지 더 하면 결과는?
		// 1 ~ 25 까지 더 하면 결과는?
		// 30 ~ 60 까지 더 하면 ?
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		//메소드 호출
		printSum(1, 100);
		printSum(1, 50);
		printSum(30, 60);
		int hap = returnSum(50, 60);
		System.out.println("리턴 받았음 " + hap);
		System.out.println("리턴 받았음 " + returnSum(50, 60));
		
		MakeTree(5);
		MakeTree(10);
		MakeTree(100);
		// abs 절대값을 리턴하는 메소드 		
		int num1 = Math.abs(-10);
		print(num1);
		print(MyAbs(-10));
		
	}
	// 메소드 생성 
	// [접근제어자 static] 리턴타입 메소드명(파라미터){
	/**
	 * @Method Name : printSum
	 * @작성일       : 2023. 7. 21.
	 * @작성자       : leeapgil
	 * @메소드설명    : 
	 * @param       :from 시작값, to 종료값 
	 * @return      :from~to까지 값을 합하여 리턴
	 */
	public static void printSum(int from, int to) {
		 int sum = 0;
		 for(int i = from; i <= to; i++) {
			 sum +=i;
		 }
		 System.out.println(from +" 부터 " + to + " 까지 더한 결과는 " + sum);
		 print("hi");
	}
	public static int returnSum(int from, int to) {
		 int sum = 0;
		 for(int i = from; i <= to; i++) {
			 sum +=i;
		 }
		 return sum;
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	// 메소드 오버로딩 동일한 이름 입력타입이 다른 함수로 정의할 수 있음.	
	public static void print(int msg) {
		System.out.println(msg);
	}
	
	public static void MakeTree(int num) {
		for(int i = 0; i < num ; i++) {
			for(int j = num - i ; j > 1 ; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= 2 * i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static int MyAbs(int num) {
		if(num <0) {
			num *=-1;
		}
		return num;
	}

}
