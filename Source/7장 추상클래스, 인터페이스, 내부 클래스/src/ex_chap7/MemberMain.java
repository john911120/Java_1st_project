package ex_chap7;

import java.util.Scanner;

public class MemberMain {
/**
 * ȸ�� ���� ���� �������α׷�
 * �ۼ��� : 1127
 */
	static MemberVO[] members;
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		Scanner sc = new Scanner(System.in);
		members = new MemberVO[0];
		boolean isStop = false;
		do {
			System.out.println("���� �� ���ϴ� �޴� �ϳ��� �Է��ϼ���");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ȸ�� ��� ����");
			System.out.println("3. ȸ�� Ż��");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ����");
			
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
