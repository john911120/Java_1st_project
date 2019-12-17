package Chap5_Ex;

public class SearchService {
	/*
	 * 회원 정보를 저장하는 클래스
	 * 작성일  : 1119
	 * 회원 이름으로 배열 객체에서 회원을 검색하는 실기능
	 */
	
	/*
	 * member타입의 객체를 저장할 객체를 member로 생성
	 * 회원 정보 객체 5개를 만든다.
	 * 회원이름을 파라미터값으로 받아서 회원 정보를 출력해주는 기능을 만든다.
	 * 이름을 가지고 있는 회원정보가 찾아졌는가를 저장하는 변수를 정의하고 기본값을 false로 지정
	 * 배열 객체에 저장되어있는 객체 수만큼 for문을 실행하는 영역을 정의하였고
	 * 회원정보가 일치한가? 찾아졌다면 printinfo(members[i])를 호출에서 인덱스의 정보를 출력한다.
	 * if를 만족한다면 회원 정보를 찾은 것이기 때문에 searchResult 변수 값을 true로 설정
	 * 마지막으로 찾았는가 못 찾았는가를 boolean타입의 변수 searchResult값으로 리턴해주고 getter메서도를 호출해서
	 * 출력해주는 부분이다.
	 */
	Member[] members = new Member[5];
	public SearchService() {
		members[0] = new Member("시명이", 164, 70,"한국");
		members[1] = new Member("johns", 162, 67,"영국");
		members[2] = new Member("성룡", 174, 72,"중국");
		members[3] = new Member("니콜라스", 175, 75,"미국");
		members[4] = new Member("리나", 154, 59,"일본");
	}
	boolean searchMember(String name) {
		boolean searchResult = false;
		for(int i = 0; i < members.length;i++) {
			if(members[i].getName().equals(name)) {
				printinfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}
	private void printinfo(Member member) {
		System.out.println(member.getName() + "으로 찾은 결과");
		System.out.println("이름 : " + member.getName());
		System.out.println("신장 : " + member.getHeight());
		System.out.println("몸무게 : " + member.getWeight());
		System.out.println("국가 : " + member.getNation());
	}
}
