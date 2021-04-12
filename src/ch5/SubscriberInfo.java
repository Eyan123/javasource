package ch5;

public class SubscriberInfo {
	// 가입자 정보 클래스
	// 속성-이름(홍길동),아이디(sdf123),패스워드(sdf324),전화번호,주소

	String name;
	String id;
	String passward;
	String tel;
	String addr;

	public SubscriberInfo() {
		super();
	}

	public SubscriberInfo(String name, String id, String passward) {
		super();
		this.name = name;
		this.id = id;
		this.passward = passward;
	}

	public SubscriberInfo(String name, String id, String passward, String tel, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.passward = passward;
		this.tel = tel;
		this.addr = addr;
	}

	// 기능 - 비밀번호 변경 / 전화번호 등록 / 주소등록

	// 비밀번호변경(changePwd)
	// 전화번호등록(setTel)
	// 주소등록(setAddr)

	void changePwd(String passward) {
		this.passward = passward;
	}

	void setTel(String tel) {
		this.tel = tel;
	}

	void setAddr(String addr) {
		this.addr = addr;
	}

}
