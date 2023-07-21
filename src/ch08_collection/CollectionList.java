package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionList {

	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크는 데이터를 보다 쉽게 다룰 수 있도록 
		 * 재사용 가능한 컬렉션 클래스를 제공함 
		 * List, Set, Map
		 * 1.List :순서대로 객체를 저장하는 구조, 중복된 원소를 허용
		 *         원소에 접근하기 위해 인덱스를 사용 
		 *         대표적인 ArrayList, LinkedList
		 * 2.Set :중복을 허용하지 않는 객체의 모음
		 *        원소의 순서는 보장되지 않음 
		 *        대표 :HashSet, TreeSet
		 * 3.Map :키와 값의 쌍으로 이루어진 객체를 저장하는 구조 
		 *        키는 중복될 수 없으며 
		 *        각 키는 하나의 값을 가리킴.
		 *        대표 :HashMap, TreeMap 
		 * */
		// ArrayList(동적 배열형태) 
		ArrayList<String> students = new ArrayList<String>();
		//< > <-- 이부분을 제네릭(Generic)이라고함. 
		// 코드에서 타입의 안정성을 보장할 수 있으며 불필요한 타입 캐스팅을 줄일 수 있음
		// 제네릭은 객체(참조타입)만 담을 수 있음.
		// Wrapper Class (기본타입을 객체로 만든 클래스)		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		//래퍼클래스는 (byte, short, int, long, float, double, char, boolean)
		// 의 기본 타입이름의 앞글자 대문자로 되어있음. 
		// list 기본 메서드 .add(요소)  요소 추가시 사용
		intList.add(5);
		intList.add(1);
		intList.add(2);
		intList.add(4);
		System.out.println(intList);
		
		students.add("팽수");
		students.add("길동");
		students.add("동길");
        System.out.println(students);
        
        // .get(인덱스) 해당 인덱스 값을 리턴 
        System.out.println(intList.get(0));
        // .set(인덱스, 값) 요소 변경 
        students.set(0, "팽귄");
        System.out.println(students);
        // .contains(값) 리스트 안에 해당 값이 존재하면 true리턴, 아닐경우 false
        System.out.println(students.contains("길동"));
        // .indexOf(값) 리스트 안에 해당 값이 몇번에 존재하는지 리턴 없으면 -1 
        System.out.println(students.indexOf("팽수"));
        // .isEmpty() 리스트가 비어있는지 체크 (true/false)
        System.out.println(students.isEmpty());
        // .size() 리스트의 요소 수 
        System.out.println(students.size());
        // .remove(값) 해당값이 있으면 삭제 없으면 아무일 안일어남.
        students.remove("홍길동");
        System.out.println(students);
        // .clear() 리스트 비움 (size 0됨)
        students.clear();
        System.out.println(students);
        intList = new ArrayList<>(); // clear()처럼 비워짐 
        System.out.println("\n==================");
        
        students.add("김규영");
        students.add("김동현");
        students.add("김상준");
        students.add("김성운");
        students.add("김세준");
        System.out.println(students);
        for(int i= 0; i < students.size(); i++) {
        	students.set(i, (i + 1) + ". " + students.get(i));
        }
        System.out.println(students);
        // 1 리스트 복사 
        ArrayList<String> copyList = new ArrayList<String>();
        copyList.addAll(students);
        System.out.println(copyList);
        // 2 리스트 복사 
        ArrayList<String> copyList2 = new ArrayList<String>(students);
        System.out.println(copyList2);
        // 3 리스트 복사 (특정 작업 처리 후 복사할때 많이 사용)
        ArrayList<String> copyList3 = new ArrayList<String>();
        for(int i = 0 ; i < students.size(); i++) {
        	copyList3.add(students.get(i));
        }
        System.out.println(copyList3);
        
        // 향상된 for문 
        for(String str: students) {
        	System.out.println(str);
        }
        String [] strArr = {"1", "2", "3"};
        for(String str : strArr) {
        	System.out.println(str);
        }
        // 값을 주면서 선언 
        ArrayList<Integer> numbers =
        		new ArrayList<Integer>(Arrays.asList(30, 23, 1, 44, 52));
        System.out.println(numbers);
        // 정렬 오름차순 
        Collections.sort(numbers);
        System.out.println(numbers);
        // 정렬 내림차순 
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
        
        
        
        
        
        
        
        
        
        
		
	}

}
