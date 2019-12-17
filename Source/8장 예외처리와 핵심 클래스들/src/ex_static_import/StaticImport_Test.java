package ex_static_import;

import static java.lang.System.out;
import static ex_static_import.JdbcUtil.*;

public class StaticImport_Test {
	
	/*
		Static Import
		- system Ŭ������ out �ʵ带 static importó�������� out �ʵ� �ȿ�
		   �ִ� �޼ҵ�� �ʵ� �̸��� �����ϰ� �ٷ� ��� �����ϴ�.
		- jdbcUtil Ŭ���� �ȿ� �����ϴ� ��� �ʵ�� �޼ҵ带 static import�ߴ�. 
		  �̷��� ������ �޼ҵ带 �ٷ� ȣ���ؼ� ����� �� �ִ�.
		�ۼ��� : 1130
	*/
	public static void main(String[] args) {
		out.println("static import test");
		connect();
		close();
	}
}
