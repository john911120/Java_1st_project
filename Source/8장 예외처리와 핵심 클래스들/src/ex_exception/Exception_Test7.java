package ex_exception;

public class Exception_Test7 {
	/*
	 * ���� ó�� ����(throws ����)
	 * throw : ���� ��ü�� ���������� ���� �߻������ִ� �����
	 * �ۼ��� : 1128
	 */
	public void exceptionMethod() throws Exception {
		throw new Exception();
	}
	
	public static void main(String[] args) {
		Exception_Test7 et7 = new Exception_Test7();
		try {
			et7.exceptionMethod();
		} catch(Exception e) {
			System.out.println("ȣ���� �޼ҵ忡�� ���� ó����");
		}
	}

}
