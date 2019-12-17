package ex_chap7;

public class MemberVO {
	/*
	 * 회원 1명의 대한 정보를 저장하는 클래스
	 * 작성일 : 1127
	 */
	private int age;
	private String name;
	private String tel;
	private String email;
	private String nation;
	public MemberVO(int age, String name, String tel, String email
			,String nation) {
		super();
		this.age = age;
		this.email = email;
		this.name = name;
		this.tel = tel;
		this.nation = nation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
