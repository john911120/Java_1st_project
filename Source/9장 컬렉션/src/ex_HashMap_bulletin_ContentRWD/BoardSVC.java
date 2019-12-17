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
		System.out.println("게시판 글을 작성하세요.");
		System.out.print("작성자 : ");
		String register = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("비밀번호 : ");
		String passwd = sc.next();
		System.out.print("제목 : ");
		String subject = sc.next();
		System.out.print("글 내용 : ");
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
				System.out.println("작성자 : " + boardList.get(i).get("register") + 
						", subject = " + boardList.get(i).get("subject") +
						", email = " + boardList.get(i).get("email") +
						", content = " + boardList.get(i).get("content"));
			}
		}
		else {
			System.out.println("등록된 글이 없습니다.");
		}
	}
	public void removeArticle(Scanner sc) {
		System.out.println("제거할 게시글의 작성자와 비밀 번호를 입력하세요");
		System.out.print("작성자 : ");
		String register = sc.next();
		System.out.print("비밀번호 : ");
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
					System.out.println("해당 작성자가 없거나 또는 비밀번호가 일치하지 않습니다.");
					return;
				}
		}
		else {
			System.out.println("작성된 글이 존재하지 않습니다.");
		}
	}
}
