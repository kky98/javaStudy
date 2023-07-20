package ch07_array;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		//배열(array)
		String samjang= "삼장";
		String woogong= "오공";
		String saojeong="사오정";
		String palgye="저팔계";
		// 문자열 배열 String []		
		// 숫자 4는 첨자를 의미하며, 배열의 크기를 정한다. (배열의 크기는 바뀌지않음)
		String [] seoyugi = new String[4];
		// .length 배열의 길이를 리턴 		
		System.out.println(seoyugi.length);
		System.out.println(seoyugi[0]);
		// 처음 생성된 배열 내에는 기본값(default)가 들어있다. 
		// 참조타입(String, Object..) : null
		// 기본타입(int, boolean..) :숫자이면 0, boolean 이면 false
		int [] numbers = new int[3];
		System.out.println(numbers[0]);
		boolean [] bools = new boolean[5];
		System.out.println(bools[0]);
		
		// 배열에 값 넣기 
		seoyugi[0] = samjang;
		System.out.println(seoyugi[0]);
		seoyugi[1] = woogong;
		seoyugi[2] = saojeong;
		seoyugi[3] = palgye;
		System.out.println(seoyugi);
		// 0 부터 array.length 미만까지 		
		printArr(seoyugi);
		for(int i = 0; i < seoyugi.length; i++) {
			seoyugi[i] = "서유기 " + seoyugi[i];
		}
		printArr(seoyugi);
		// 오공을 찾아서 -> 드래곤볼 오공으로 변경 
	    for(int i = 0 ; i< seoyugi.length; i ++) {
	    	if(seoyugi[i].contains("오공")){
	    		seoyugi[i] = seoyugi[i].replace("서유기", "드래곤볼");
	    	}
	    }
	    printArr(seoyugi);
	    // 값을 넣으며 배열 선언
	    String [] students = {"팽수","길동","동길","길수"};
	    printArr(students);
	    String subjects = "자바, SQL, 화면구현, JSP";
	    // .split(문자열) 
	    // 대상문자열을 문자열 기준으로 나누어 배열로 리턴 
	    String [] subArr = subjects.split(",");
	    printArr(subArr);
	    for(int i = 0 ; i < subArr.length; i ++) {
	    	subArr[i] = subArr[i].trim(); // trim 양쪽 공백제거;
	    }
	    printArr(subArr);
	    // 배열의 복사(shallow copy 얇은 복사) 주소값 복사
	    String [] sinSeoyugi = seoyugi;
	    printArr(sinSeoyugi);
	    sinSeoyugi[0] = "강호동";
	    sinSeoyugi[1] = "이수근";
	    printArr(sinSeoyugi);
	    printArr(seoyugi);
	    System.out.println(sinSeoyugi);
	    System.out.println(seoyugi);
	    System.err.println(sinSeoyugi.hashCode());
	    System.err.println(seoyugi.hashCode());
	    // 깊은 복사(deep copy) 
	    // 새로운 객체	(주소가 다름)
	    String [] newSeoyugi = seoyugi.clone();
	    newSeoyugi[2] ="은지원";
	    printArr(newSeoyugi);
	    printArr(seoyugi);
	    // clone까먹었다!!
	    String [] copy = new String[seoyugi.length];
	    for(int i = 0; i < seoyugi.length; i ++) {
	    	copy[i] = seoyugi[i];
	    }
	    System.out.println(seoyugi);
	    System.out.println(copy);
	    
	    // 숫자 배열
	    int [] numArr = {23, 456, 213, 32, 464, 1, 2};
	    printArr(numArr);
	    Arrays.sort(numArr); // 오름차순
	    printArr(numArr);
	    // 내림차순	    
	    for(int i = 0; i < numArr.length ;i++) {
	    	numArr[i] = numArr[i] * -1;
	    }
	    Arrays.sort(numArr);
	    for(int i = 0; i < numArr.length ;i++) {
	    	numArr[i] = numArr[i] * -1;
	    }
	    printArr(numArr);
	    //버블정렬 
	    //이 알고리즘은 가장 큰값(or 작은값)을 마치 
	    //거품 처럼 끝으로 밀어내는 방식으로 동작 
	    
	    //배열의 처음부터 인접한 항목을 쌍으로 비교 
	    //첫번째 항목이 두번째 항목보다 크면 두 항목을 교환 
	    //반복하여 전달 전달 
	    for(int k = 0; k <numArr.length -1 ; k++) {
	    	for(int i = 0; i < numArr.length - 1; i++) {
	    		// i > i+1 하면 오름차순
	    		// i < i+1 하면 내림차순
	    		if(numArr[i] > numArr[i + 1]) {
	    			int t = numArr[i];
	    			numArr[i] = numArr[i+1];
	    			numArr[i+1] = t;
	    		}
	    	}
	    }
	    printArr(numArr);
	    
	    
	    
	    
		
	}
	public static void printArr(String[] strArr) {
		for(int i = 0 ; i < strArr.length; i++) {
			// 마지막은 , 안붙이려고				
			if(i == strArr.length -1) {
				System.out.println(strArr[i]);
				break;
			}
			System.out.print(strArr[i] + ", ");
		}
	}
	public static void printArr(int[] strArr) {
		for(int i = 0 ; i < strArr.length; i++) {
			// 마지막은 , 안붙이려고				
			if(i == strArr.length -1) {
				System.out.println(strArr[i]);
				break;
			}
			System.out.print(strArr[i] + ", ");
		}
	}
	
	
}
