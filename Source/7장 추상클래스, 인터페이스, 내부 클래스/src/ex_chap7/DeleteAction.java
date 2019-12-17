package ex_chap7;

import java.util.Scanner;

/*
 * ȸ�� ���� ��û�� ó�����ִ� Ŭ����
 * �ۼ��� : 1127
 */

public class DeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ ȸ���� �̸��� �Է��ϼ���");
		System.out.print("�̸� : ");
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
			System.out.println("ȸ�� ������ ��ġ���� �ʽ��ϴ�.");
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
