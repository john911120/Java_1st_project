package ex_interface;

/*
 * �� ���� ��û ó�� �޼ҵ带 �����ϴ� Ŭ���� ����
 */
public class WriteCommand implements Command {

	@Override
	public void excute() {
		System.out.println("���� ���� �ۼ��ϱ�");
	}

}
