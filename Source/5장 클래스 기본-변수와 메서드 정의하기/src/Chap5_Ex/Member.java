package Chap5_Ex;

public class Member {
	/*
	 * 회원 정보를 저장하는 클래스
	 * 작성일  : 1119
	 * 회원의 이름과 체중, 신장, 국적을  자기 자신의 객체를 참조하는 레퍼런스 변수를 넣었다.
	 * getter setter으로 객체를 캡슐화하였다.
	 */
	private String name;
	private int height;
	private int weight;
	private String nation;

	public Member(String name, int height, int weight, String nation) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.nation = nation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
}
