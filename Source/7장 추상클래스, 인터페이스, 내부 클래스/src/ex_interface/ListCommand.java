package ex_interface;

/*
 * ��� ���� ��û ó�� �޼ҵ带 �����ϴ� Ŭ���� �����ϱ�
 */

public class ListCommand implements Command {

	@Override
	public void excute() {
		System.out.println("��ü ����� �����ش�.");
	}

}
