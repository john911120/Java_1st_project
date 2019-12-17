package ex_static_import;

public class JdbcUtil {
	
	/*
		DB연결 및 해제 메소드 정의
		DB를 연결하거나 연결 해제하는 메소드를 가상으로 static 메소드로 정의한다.
		작성일 : 1130
	*/
	public static void connect() {
		System.out.println("db 연결");
	}
	public static void close() {
		System.out.println("db 종료");
	}
}
