package ch10_extends_interface.starcraft;

public class StarUnit {
	
	private String name;
	private int damage;
	private int hp;
	private int armor;
	
	public StarUnit() {
	}
	public StarUnit(String name, int damage, int hp, int armor) {
		super();
		this.name = name;
		this.damage = damage;
		this.hp = hp;
		this.armor = armor;
	}
	public void move(int x, int y) {
		System.out.println(name +"이(가) x:" + x + ", y:" +y +"로 이동");
	}
	public void attack(StarUnit unit) {
		unit.setHp(unit.getHp() - damage);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	@Override
	public String toString() {
		return "StarUnit [name=" + name + ", damage=" + damage + ", hp=" + hp + ", armor=" + armor + "]";
	}
	
	
}
