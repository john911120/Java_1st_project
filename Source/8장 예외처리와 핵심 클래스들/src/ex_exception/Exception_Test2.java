package ex_exception;

public class Exception_Test2 {

	/*
	 * ���� ó�� ����(try ~ catch���� ����� ����)
	 * ������ 0���� ������
	 * �ۼ��� : 1128
	 */
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10/num;
			System.out.println("result = " + result);
		} catch(ArithmeticException e){
			System.out.println("������ 0���� ������ �������� ������ָ�");
		}
		System.out.println("���α׷� ��� ����");
	}

}
