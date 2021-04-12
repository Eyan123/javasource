package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx4 {
	public static void main(String[] args) {
		
		Member member1 = new Member("김에바", "비번임");
		Member member2 = new Member("박신오", "1234");
		Member member3 = new Member("라이스", "ㅎㅎㅎㅎ");
		Member member4 = new Member("마쿠인", "에바참치");
		
		List<Member> members = new ArrayList<Member>();
		
		members.add(member1);
		members.add(member2);
		members.add(member3);
		members.add(member4);
		
		//System.out.println(members);
		
//		for(int i=0; i<members.size(); i++) {
//			System.out.println("아이디 : " + members.get(i).getId());
//			System.out.println("비밀번호 : " + members.get(i).getPassword());
//			System.out.println();
//		}
		
		for(Member member : members) {
			System.out.println(member.getId());
			System.out.println(member.getPassword());
			System.out.println();
		}
		
		
		
	}
}
