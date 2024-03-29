package ex_HashMap_bulletin_ContentRWD;

import java.util.Scanner;

public class BoardMain {
/*
 	게시판 글쓰기 CRUD(Java.ver) Main + HashMap기능 추가
 	작성일 : 1204
 */
	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();
		do {
			System.out.println("메뉴를 입력하세요");
			System.out.println("1. 게시글 작성하기");
			System.out.println("2. 게시글 목록 보기");
			System.out.println("3. 게시글 삭제하기");
			System.out.println("4. 게시판 종료");
			
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
