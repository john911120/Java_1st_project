package ex_chap7;

import java.util.Scanner;

/*
 * 회원보기 요청을 처리해주는 클래스
 * 작성일 : 1127
 */
public class ListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		MemberVO[] members = MemberMain.members;
		if(members.length >= 1) {
			for(int i = 0; i < members.length;i++) {
				System.out.println("이름: " + members[i].getName() + 
						",전화번호: " + members[i].getTel()+
						",국가: " + members[i].getNation() + 
						",나이: " + members[i].getAge() + 
						", email: " + members[i].getEmail());
			}
		}
		else {
			System.out.println("회원 정보가 일치 하지 않습니다.");
		}
	}

}
