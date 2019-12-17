package Chap5_Ex;

import java.util.Scanner;

public class Main_Search {
	/*
	 * 회원 정보를 저장하는 클래스
	 * 작성일  : 1119
	 * 사용자로부터 이름을 받는 main클래스이다.
	 */
	public static void main(String[] args) {
		SearchService sv = new SearchService();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("검색할 회원의 이름을 입력하세요");
			String name = sc.next();
			boolean searchResult = sv.searchMember(name);
			if(searchResult) break;
			System.out.println("검색한 회원의 정보가 일치하지 않습니다.");
		}
		while(true);
	}

}
