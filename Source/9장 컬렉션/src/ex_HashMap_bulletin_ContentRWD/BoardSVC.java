package ex_HashMap_bulletin_ContentRWD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class BoardSVC {
	ArrayList<HashMap<String, String>>boardList;
	
	public BoardSVC() {
		boardList = new ArrayList<HashMap<String, String>>();
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
		
		HashMap<String, String> boardMap  = new HashMap<String, String>();
		boardMap.put("register", register);
		boardMap.put("subject", subject);
		boardMap.put("email", email);
		boardMap.put("content", content);
		boardMap.put("passwd", passwd);
		
		addArticle(boardMap);
	}

	private void addArticle(HashMap<String, String> boardMap) {
		boardList.add(boardMap);
	}
	
	public void listArticles(Scanner sc) {
		if(boardList.size() > 0) {
			for(int i = 0; i<boardList.size(); i++) {
				System.out.println("�ۼ��� : " + boardList.get(i).get("register") + 
						", subject = " + boardList.get(i).get("subject") +
						", email = " + boardList.get(i).get("email") +
						", content = " + boardList.get(i).get("content"));
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
				if(boardList.get(i).get("register").equals(register)) {
					if(boardList.get(i).get("passwd").equals(passwd)) {
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
