package ex_exception;

public class Exception_Test6 {
	/*
	 * ���� ó�� ����(RuntimeException ����)
	 * throw : ���� ��ü�� ���������� ���� �߻������ִ� �����
	 * �ۼ��� : 1128
	 */
	public void exceptionMethod() {
		throw new NullPointerException();
	}
	
	public static void main(String[] args) {
		Exception_Test6 et6 = new Exception_Test6();
		et6.exceptionMethod();
	}

}
