package practice.submit07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Result07 {

	public static void main(String[] args) {
		//q01
		
		//q.3
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> weekLotto = null;
		System.out.println("========================================");
		System.out.println("행운의 로또 번호 생성기 입니다.");
		System.out.println("입력값이 있으면 y 입력값이 없으면 n 을 선택하세요>>");
		String select = scanner.nextLine();
		if(select.equalsIgnoreCase("y")) {
			System.err.println("번호를 한칸씩 띄어서 입력해주세요 최대 6개");
			String [] numArr = scanner.nextLine().split(" ");
			System.out.println("입력하신 번호는");
			for(int i = 0 ;i < numArr.length ; i++) {
				if( i == (numArr.length -1)) {
					System.out.println(numArr[i]);
					break;
				}
				System.out.print(numArr[i] + ",");
			}
			weekLotto = makeLotto(numArr);
		}else {
			weekLotto = makeLotto();
		}
		System.out.println("이번주 행운의 번호는 ★");
		System.out.println(weekLotto);
		System.out.println("GOOD LUCK ★");
		System.out.println("================================");
	}
	public static ArrayList<Integer> makeLotto(){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		String [] arr = new String[0];
		numbers = makeLotto(arr);
		return numbers;
	}
	public static ArrayList<Integer> makeLotto(String [] arr){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0 ; i <arr.length; i ++) {
			numbers.add(Integer.parseInt(arr[i]));
		}
		while(numbers.size() < 6) {
			int lotto = (int) (Math.random() * 45 + 1);
			boolean isEqual = false;
			for(int i = 0;i <numbers.size(); i++) {
				if(lotto == numbers.get(i)) {
					isEqual = true;
				}
			}
			if(!isEqual) {
				numbers.add(lotto);
			}
		}
		Collections.sort(numbers);
		return numbers;
	}
	
	
	
	public static ArrayList<Integer> shuffleLotto(){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int maxNum = 45;
		for(int i = 1; i <= maxNum; i++) {
			numbers.add(i);
		}
//		System.out.println(numbers);
		Collections.shuffle(numbers);
//		System.out.println("shuffle" + numbers);
		ArrayList<Integer> result =
				new ArrayList<Integer>(numbers.subList(0, 6));
		return result;
	}
	public static ArrayList<Integer> setLotto(){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		while(lottoSet.size() < 6) {
			int num = (int) (Math.random() * 45 + 1);
			lottoSet.add(num);
		}
		for(Integer val : lottoSet) {
			numbers.add(val);
		}
		Collections.sort(numbers);
		return numbers;
	}
	
	
}
