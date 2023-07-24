package ch09_class.school;

import ch09_class.commons.UtilClass;

public class Student {
	// 1.필드 변수 선언 
	// 접근 제어자 
	// public : 공개, 프로젝트 내부 어디서든 접근 가능
	// private : 비공개, 현재 클래스 내에서만 접근 
	// (default): 같은 폴더 내에 있는 클래스에서만 접근 가능
	// 캡슐화는 필드 변수 접근제어자를 전부 private으로 만듬 
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	// 2.생성자 만들기 
	public Student() {	}
    //Shift + Alt + s
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setAvg();
	}
	// 오버로딩 	
	public Student(String name, int kor, int eng, int math, double avg) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
	}
	// 3.toString() 추가 
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}
	// 4.Getter and Setters..
	// private으로 접근을 막은 필드변수에 대해 접근하기 위한 메서드 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		setAvg();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		setAvg();
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
		setAvg();
	}
	private void setAvg() {
		//this.avg 동일함.		
		avg = UtilClass.weRound((kor + eng + math) / 3.0, 1 );
	}
	public double getAvg() {
		return avg;
	}
	
	
}
