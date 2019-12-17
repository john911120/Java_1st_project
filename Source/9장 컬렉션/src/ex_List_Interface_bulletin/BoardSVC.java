package ex_List_Interface_bulletin;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	ArrayList<BoardVO>boardList;
	
	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
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
				if(boardList.get(i).getRegister().equals(register)) {
					if(boardList.get(i).getPasswd().equals(passwd)) {
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
