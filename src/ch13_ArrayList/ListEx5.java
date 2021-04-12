package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx5 {
	public static void main(String[] args) {
				
		List<Member> members = new ArrayList<Member>();
		
		members.add(new Member("김에바", "비번임"));
		members.add(new Member("박신오", "1234"));
		members.add(new Member("라이스", "ㅎㅎㅎㅎ"));
		members.add(new Member("마쿠인", "에바참치"));
		
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
