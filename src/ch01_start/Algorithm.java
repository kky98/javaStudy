package ch01_start;

public class Algorithm {

	public static void main(String[] args) {
		/*
		 * 알고리즘은 
		 * 문제를 해결하기 위한 명확한 절차나 규칙의 집합.
		 * 이 단계들은 모두 명확해야 하며, 특정 입력이 주어졌을 때 어떤 출력이 
		 * 나올지 결정한다. 
		 * 즉, 알고리즘은 입력을 출력으로 변환하는 함수라고 볼 수 있음. 
		 * 
		 * 두 수를 더하는 것을 하는 알고리즘
		 * 
		 * (1) 두 수를 입력 받는다. 
		 * (2) 두 수를 더한다. 
		 * (3) 결과를 반환한다. 
		 * 
		 * 수학 식으로 나타내면 f(a, b) = a + b
		 * f(2, 3) = 2 + 3 = 5
		 * */
		System.out.println(f(2, 3));
	}
	//            int(리턴타입을 의미함) f 메서드명(a,b) <-- input  
	public static int f(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	}

}
