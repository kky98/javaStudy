package ch09_class.homepage;

public class Member {
	 private String id;            /*아이디*/
	 private String password;      /*비밀번호*/
	 private String name;          /*이름*/
	 
	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	} 
	
	
	
	 
	 
	 
}
