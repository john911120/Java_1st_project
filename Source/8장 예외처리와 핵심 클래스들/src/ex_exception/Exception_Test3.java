package ex_exception;

public class Exception_Test3 {

	/*
	 * ���� ó�� ����(try ~ catch ���� ���� ó�� ����)
	 * ������ 0���� ������
	 * �ۼ��� : 1128
	 */
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10 / num;
			System.out.println("result = " + result);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("���ڸ� �ϳ� �Է��ϼ���");
		}
		catch(NumberFormatException e) {
			System.out.println("���ڸ� ���� Ÿ������ �Է��ϼ���");
		}
		catch(ArithmeticException e) {
			System.out.println("������ 0���� ������ ������ ������ָ�");
		}
		System.out.println("�ý��� ���� �̸��ο�!");
	}

}
