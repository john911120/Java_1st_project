package ex_static_import;

import static java.lang.System.out;
import static ex_static_import.JdbcUtil.*;

public class StaticImport_Test {
	
	/*
		Static Import
		- system 클래스의 out 필드를 static import처리함으로 out 필드 안에
		   있는 메소드는 필드 이름을 지정하고 바로 사용 가능하다.
		- jdbcUtil 클래스 안에 존재하는 모든 필드와 메소드를 static import했다. 
		  이렇게 함으로 메소드를 바로 호출해서 사용할 수 있다.
		작성일 : 1130
	*/
	public static void main(String[] args) {
		out.println("static import test");
		connect();
		close();
	}
}
