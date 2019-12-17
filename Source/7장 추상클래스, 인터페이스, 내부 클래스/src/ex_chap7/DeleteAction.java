package ex_chap7;

import java.util.Scanner;

/*
 * 회원 삭제 요청을 처리해주는 클래스
 * 작성일 : 1127
 */

public class DeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 회원의 이름을 입력하세요");
		System.out.print("이름 : ");
		String name = sc.next();
		deleteMember(name);
	}

	private void deleteMember(String name) {
		int deleteindex = -1;
		MemberVO[] members = MemberMain.members;
		MemberVO[] temp = null;
		for(int i = 0; i<members.length; i++) {
			if(members[i].getName().equals(name)) {
				deleteindex = i;
			}
		}
		
		if(deleteindex == -1) {
			System.out.println("회원 정보기 일치하지 않습니다.");
			return;
		}
		
		if(members.length >= 1) {
			temp = new MemberVO[members.length -1];
			for(int i = 0; i < members.length; i++) {
				if(i == deleteindex) {
					continue;
				}
				else if(i > deleteindex) {
					temp[i - 1] = members[i];
				}
				temp[i] = members[i];
			}
			MemberMain.members = temp;
			}
		}
	}
