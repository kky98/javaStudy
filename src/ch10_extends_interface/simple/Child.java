package ch10_extends_interface.simple;
//Child는 Parent를 상속 받음 (extends)
public class Child extends Parent{

	
	public Child() {
		super();
	}
	public Child(String name, int age) {
		super(name, age);
	}
	@Override  // 부모의 sayHello 메서드를 재정의 
	public void sayHello() {
		System.out.println("자식입니다. !!!");
	}
	@Override
	public String toString() {
		return "Child [toString()=" + super.toString() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
