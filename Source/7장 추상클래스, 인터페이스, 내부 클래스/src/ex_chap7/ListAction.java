package ex_chap7;

import java.util.Scanner;

/*
 * ȸ������ ��û�� ó�����ִ� Ŭ����
 * �ۼ��� : 1127
 */
public class ListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		MemberVO[] members = MemberMain.members;
		if(members.length >= 1) {
			for(int i = 0; i < members.length;i++) {
				System.out.println("�̸�: " + members[i].getName() + 
						",��ȭ��ȣ: " + members[i].getTel()+
						",����: " + members[i].getNation() + 
						",����: " + members[i].getAge() + 
						", email: " + members[i].getEmail());
			}
		}
		else {
			System.out.println("ȸ�� ������ ��ġ ���� �ʽ��ϴ�.");
		}
	}

}
