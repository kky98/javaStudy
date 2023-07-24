package ch09_class.homepage;

import java.util.ArrayList;

public class MemberDB {
	private ArrayList<Member> memList = new ArrayList<Member>();
	
	//싱글폰 패턴 적용 
	private MemberDB() {
		memList.add(new Member("admin", "admin", "관리자"));
	}
	private static MemberDB instance = new MemberDB();
	
	public static MemberDB getInstance() {
		 return instance;
	}
	// 회원 목록 조회 
	public void showMemberList() {
		for(int i = 0 ; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}
	}
	// 회원 가입 메소드
	public void registMember(Member mem) {
		for(int i =0; i < memList.size(); i++) {
			if(mem.getId().equals(memList.get(i).getId())) {
				System.out.println("중복된 아이디 입니다.");
				return;
			}
		}
		memList.add(mem);
	}
	// 로그인 id & pw 일치 
	public Member login(String id, String pw) {
		for(int i=0; i < memList.size(); i++) {
			if(memList.get(i).getId().equals(id) && 
					memList.get(i).getPassword().equals(pw)) {
				return memList.get(i);
			}
		}
		return null;
	}
}
