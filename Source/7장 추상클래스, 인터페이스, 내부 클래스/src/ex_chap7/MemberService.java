package ex_chap7;

import java.util.Scanner;

public class MemberService {
	/*
	 * �������� ����Ͻ� ������ �����ϴ� Service Ŭ���� ����
	 */
	void process(Action action,Scanner sc) {
		action.execute(sc);
	}
}
