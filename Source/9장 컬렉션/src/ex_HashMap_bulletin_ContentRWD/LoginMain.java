package ex_HashMap_bulletin_ContentRWD;

import java.util.Scanner;

public class LoginMain {

	/*
	  	�α��� ����(HashMap Ȱ�� ����)
	  	�ۼ��� : 1204
	 */
	
	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		LoginSVC loginSVC = new LoginSVC();
		
		do {
			System.out.println("�α��� ȭ��");
			System.out.println("���̵�� ��й�ȣ�� �Է��Ͻÿ�");
			System.out.print("���̵� : ");
			String id = sc.next();
			System.out.print("��й�ȣ : ");
			String passwd = sc.next();
			
			User user = loginSVC.login(id,passwd);
			if(user == null) {
				System.out.println("���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			else {
				System.out.println("�α����� ������� ������ ������ �����ϴ�.");
				System.out.println(user);
				isStop = true;
			}
		}
		while(!isStop);
	}

}
