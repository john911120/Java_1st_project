package ex_chap7;

import java.util.Scanner;

public class MemberService {
	/*
	 * 실질적인 비즈니스 로직을 정의하는 Service 클래스 정의
	 */
	void process(Action action,Scanner sc) {
		action.execute(sc);
	}
}
