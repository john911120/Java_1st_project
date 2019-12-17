package ex_List_Interface_bulletin;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	ArrayList<BoardVO>boardList;
	
	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}
	
	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��� ���� �ۼ��ϼ���.");
		System.out.print("�ۼ��� : ");
		String register = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		System.out.print("��й�ȣ : ");
		String passwd = sc.next();
		System.out.print("���� : ");
		String subject = sc.next();
		System.out.print("�� ���� : ");
		String content = sc.next();
		
		BoardVO boardVO = new BoardVO(register, email, passwd, subject, content);
		addArticle(boardVO);
		
	}

	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}
	
	public void listArticles(Scanner sc) {
		if(boardList.size() > 0) {
			for(int i = 0; i<boardList.size(); i++) {
				System.out.println(boardList.get(i));
			}
		}
		else {
			System.out.println("��ϵ� ���� �����ϴ�.");
		}
	}
	public void removeArticle(Scanner sc) {
		System.out.println("������ �Խñ��� �ۼ��ڿ� ��� ��ȣ�� �Է��ϼ���");
		System.out.print("�ۼ��� : ");
		String register = sc.next();
		System.out.print("��й�ȣ : ");
		String passwd = sc.next();
		
		removeArticle(register,passwd);
	}

	private void removeArticle(String register, String passwd) {
		if(boardList.size() > 0) {
			int index = -1;
			for (int i = 0; i <boardList.size();i++) {
				if(boardList.get(i).getRegister().equals(register)) {
					if(boardList.get(i).getPasswd().equals(passwd)) {
						boardList.remove(boardList.get(i));
						index = i;
					}
				}
			}
				if(index == -1) {
					System.out.println("�ش� �ۼ��ڰ� ���ų� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					return;
				}
		}
		else {
			System.out.println("�ۼ��� ���� �������� �ʽ��ϴ�.");
		}
	}
}
