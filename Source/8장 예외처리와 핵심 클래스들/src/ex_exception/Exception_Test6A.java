package ex_exception;

public class Exception_Test6A {
	/*
	 * ���� ó�� ����(�Ϲ�Exception ����)
	 * throw : ���� ��ü�� ���������� ���� �߻������ִ� �����
	 * �ۼ��� : 1128
	 */
	public void exceptionMethod() {
		//throw new NullPointerException();
		
		/* �Ϲ� exception ���� �߻��Ѵ�.
		throw new ClassNotFoundException();
		*/
	}
	
	public static void main(String[] args) {
		Exception_Test6A et6 = new Exception_Test6A();
		et6.exceptionMethod();
	}

}
