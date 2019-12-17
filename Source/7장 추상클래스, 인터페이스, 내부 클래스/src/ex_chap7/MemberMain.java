package ex_chap7;

import java.util.Scanner;

public class MemberMain {
/**
 * 회원 관리 예제 메인프로그램
 * 작성일 : 1127
 */
	static MemberVO[] members;
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		Scanner sc = new Scanner(System.in);
		members = new MemberVO[0];
		boolean isStop = false;
		do {
			System.out.println("다음 중 원하는 메뉴 하나를 입력하세요");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 목록 보기");
			System.out.println("3. 회원 탈퇴");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 종료");
			
			String command = sc.next();
			switch(command) {
			case"1":
				AddAction writeAction = new AddAction();
				memberService.process(writeAction, sc);
			break;
			
			case"2":
				ListAction listAction = new ListAction();
				memberService.process(listAction, sc);
			break;
			
			case"3":
				DeleteAction deleteAction = new DeleteAction();
				memberService.process(deleteAction, sc);
			break;
			
			case"4":
				UpdateAction updateAction = new UpdateAction();
				memberService.process(updateAction, sc);
			break;
			
			case"5":
				isStop = true;
			}
		}
		while(!isStop);
	}

}
