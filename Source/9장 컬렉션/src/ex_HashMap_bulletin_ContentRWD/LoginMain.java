package ex_HashMap_bulletin_ContentRWD;

import java.util.Scanner;

public class LoginMain {

	/*
	  	로그인 예제(HashMap 활용 예제)
	  	작성일 : 1204
	 */
	
	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		LoginSVC loginSVC = new LoginSVC();
		
		do {
			System.out.println("로그인 화면");
			System.out.println("아이디와 비밀번호를 입력하시오");
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String passwd = sc.next();
			
			User user = loginSVC.login(id,passwd);
			if(user == null) {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			}
			else {
				System.out.println("로그인한 사용자의 정보는 다음과 같습니다.");
				System.out.println(user);
				isStop = true;
			}
		}
		while(!isStop);
	}

}
