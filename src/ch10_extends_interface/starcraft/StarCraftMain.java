package ch10_extends_interface.starcraft;

import java.util.ArrayList;

public class StarCraftMain {

	public static void main(String[] args) {
		 Marine marine01 = new Marine("마린", 6, 50, 0);
		 Marine marine02 = new Marine();
		 marine01.move(100, 200);
		 marine01.stimpack();
		 System.out.println(marine01);
		 System.out.println(marine02);
		 
		 Zealot zealot01 = new Zealot();
		 zealot01.move(10, 5);
		 System.out.println(zealot01);
		 
		 // 다형성(Polymorphism)
		 // 오버라이딩, 오버로딩, 업캐스팅, 다운캐스팅 
		 // 하나의 객체가 여러 타입을 가질 수 있음
		 // 자식 객체에서 부모 객체로 형변환이 가능 
		 StarUnit highTemplar1 = new HighTemplar();
		 HighTemplar highTemplar2 = new HighTemplar();
		 // 자식에서 부모 객체로 형변환은 자동으로 됨. 
		 StarUnit highTemplar3 = highTemplar2;
		 System.out.println(highTemplar1);
		 System.out.println(highTemplar2);
		 System.out.println(highTemplar3);
		 
		 ArrayList<StarUnit> starList = new ArrayList<StarUnit>();
		 starList.add(zealot01);
		 starList.add(marine01);
		 starList.add(marine02);
		 starList.add(highTemplar1);
		 starList.add(highTemplar2);
		 
		 for(int i = 0 ; i < starList.size(); i ++) {
			 starList.get(i).move(100, 150);
		 }
		 
		 
		 
	}

}
