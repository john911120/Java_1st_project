package ex_HashMap_bulletin_ContentRWD;

import java.util.Scanner;

public class BoardMain {
/*
 	�Խ��� �۾��� CRUD(Java.ver) Main + HashMap��� �߰�
 	�ۼ��� : 1204
 */
	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();
		do {
			System.out.println("�޴��� �Է��ϼ���");
			System.out.println("1. �Խñ� �ۼ��ϱ�");
			System.out.println("2. �Խñ� ��� ����");
			System.out.println("3. �Խñ� �����ϱ�");
			System.out.println("4. �Խ��� ����");
			
			String menu = sc.next();
			switch(menu) {
			case "1":
				boardSVC.writeArticle(sc);
				break;
			case "2":
				boardSVC.listArticles(sc);
				break;
			case "3":
				boardSVC.removeArticle(sc);
				break;
			case "4":
				isStop = true;
			}
		}
		while(!isStop);
	}

}
