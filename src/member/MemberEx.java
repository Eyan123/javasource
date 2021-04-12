package member;

import java.util.Scanner;

public class MemberEx {
	public static void main(String[] args) {
//		Member member1 = new  Member();
//		Member member2 = new  Member(2012, "홍길동", "서울", "대한민국", "dsfsdf@naver.com", 32);
//		
//		System.out.println(member1);
//		System.out.println(member2);
		
		Scanner sc = new Scanner(System.in);
		boolean onOff = true;
		
		MemberConsoleUtil util = new MemberConsoleUtil();
		
		//여러명의 회원정보 처리
		Member[] members = new Member[3];
		
		while(onOff) {
			
			System.out.println("====== 회원관리 프로그램 ======");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원목록보기");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 회원정보삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴번호 : ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			
			case 1 : 
				Member newMember = util.getNewMember(sc);
								
				for(int i=0; i<members.length; i++) {
					if(members[i]==null) {
						members[i]=newMember;
						break;
					}
				}

				util.printAddSuccessMessage(newMember);
				break;
			case 2 : 
		
				util.printMemberList(members);
				break;
			case 3 : 
				
				Member member = util.getUpdateMember(sc, members);
				
				if(member!=null) {
					util.printModifySuccessMessage(member);
				}
				break;
			case 4 : 
				util.removeMember(sc, members);
				break;
			case 5 : 
				System.out.println("종료");
				onOff = false;				
			}
		}
 		
		
		
	}
}
