package ex_interface;

import ex_interface.Command;
import ex_interface.CommandProcess;

public class ex_AnonymousInnerTest {
	/**
	 * �͸� ���� Ŭ���� �׽�Ʈ
	 * �ۼ��� : 1127
	 */

	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();
		cp.process(new Command(){
			
			@Override
			public void excute() {
				System.out.println("���뺸�� ����");				
			}
		});
	}
}