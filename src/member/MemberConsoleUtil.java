package member;

import java.util.Scanner;

public class MemberConsoleUtil {

	public MemberConsoleUtil() {
		super();
	}

	// 사용자로 부터 회원정보를 입력받은 후 입력받은 회원정보를 리턴
	Member getNewMember(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("아이디 : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("국가 : ");
		String nation = sc.nextLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
				
		return new Member(id, name, addr, nation, email, age);
	}
	
	void printAddSuccessMessage(Member newMember) {
		System.out.println(newMember.getName()+ "회원 정보 추가 성공");
	}

	void printModifySuccessMessage(Member member) {
		System.out.println(member.getName()+ "회원 정보 수정 성공");
	}

    void printModifyFailMessage(Member member) {
		
	}
	
    void pirntRemoveFailMessage() {
    	
    }
    
    void printRemoveSuccessMessage() {
    	
    }
    
    void printMemberList(Member[] members) {
    	
    	for(Member member : members) {
			System.out.println(member);
		}
    	
    }
    
    Member getUpdateMember(Scanner sc, Member[] members) {
    	
    	
    	System.out.print("수정할 회원의 아이디를 입력하세요 : ");
    	int id = Integer.parseInt(sc.nextLine());
    	System.out.print("수정할 주소를 입력하세요 : ");
		String addr = sc.nextLine();
		System.out.print("수정할 이메일을 입력하세요 : ");
		String email = sc.nextLine();
    	
    	
    	for(Member member : members) {
    		if(member != null) {
    			if(id == member.getId()) {
        			member.setAddr(addr);
        			member.setEmail(email);
        			
        			System.out.println("수정이 완료되었습니다");
        			return member;
        		}
    		}
    	}
    	System.out.println("일치하는 id가 없습니다");
    	return null;
    }
    
    Member removeMember(Scanner sc, Member[] members) {
    	
    	System.out.print("삭제하실 id를 입력하세요 : ");
    	
    	int id = Integer.parseInt(sc.nextLine());
    	
    	for(int i=0; i<members.length; i++) {
    		if(members[i] != null) {
    			if(members[i].getId() == id) {
    				members[i] = null;
    				return members[i];
    			}
    		}
    	}
    	System.out.println("일치하는 id가 없습니다");
    	return null;
    }
     
    
    
    
    
    
    
    
    
    
}
