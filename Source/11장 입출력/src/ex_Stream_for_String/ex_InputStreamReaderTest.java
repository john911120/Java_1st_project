package ex_Stream_for_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_InputStreamReaderTest {

	/*
	 	InputStreamReader클래스 테스트
	 	작성일 : 1210
	 */
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		
	public static void main(String[] args) {
		ex_InputStreamReaderTest isrt = new ex_InputStreamReaderTest();
		User user = isrt.getUserInfo();
		System.out.println("입력한 사용자 정보");
		System.out.println(user);
}

	private User getUserInfo() {
		User user = null;
		
		isr = new InputStreamReader(System.in);
		bfr = new BufferedReader(isr);
		
		try{
			System.out.println("사용자 정보를 입력하세요 : ");
			System.out.print("아이디 : ");
			String id = bfr.readLine();
			System.out.print("비밀번호 : ");
			String passwd = bfr.readLine();
			System.out.print("동 : ");
			String dong = bfr.readLine();
			System.out.print("나이 : ");
			int age = Integer.parseInt(bfr.readLine());
			System.out.print("이름 : ");
			String name = bfr.readLine();
			user = new User(id, passwd, dong, age, name);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				isr.close();
				bfr.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
			
		return user;
	}

}