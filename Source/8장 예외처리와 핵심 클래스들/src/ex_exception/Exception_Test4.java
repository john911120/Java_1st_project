package ex_exception;

public class Exception_Test4 {

	/*
	 * ���� ó�� ����(try ~ catch~Finally���� ������� ���� ����)
	 * �ۼ��� : 1128
	 */
	public void exceptionMethod(String[] args) {
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
		
	public static void main(String[] args) {
		Exception_Test4 et4 = new Exception_Test4();
		et4.exceptionMethod(args);
	}
}
