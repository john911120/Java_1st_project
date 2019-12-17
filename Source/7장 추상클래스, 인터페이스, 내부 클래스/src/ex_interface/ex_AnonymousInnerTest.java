package ex_interface;

import ex_interface.Command;
import ex_interface.CommandProcess;

public class ex_AnonymousInnerTest {
	/**
	 * 익명 내부 클래스 테스트
	 * 작성일 : 1127
	 */

	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();
		cp.process(new Command(){
			
			@Override
			public void excute() {
				System.out.println("내용보기 실행");				
			}
		});
	}
}