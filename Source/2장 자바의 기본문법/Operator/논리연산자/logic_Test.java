package ��������;

public class logic_Test {

	/*
	 * �� ������ �׽�Ʈ ����
	 * �ۼ��� : 191101
	 */
	
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		boolean result = false;
		
		// &&, ||, ! ������
		result = x < y && y >= 200;
		System.out.println("x < y && y >= 200 =" + result);
		
		result = x < y && y < 200;
		System.out.println("x < y && y < 200 =" + result);
		
		result = x > y && y++ >200;
		System.out.println("x > y && y++ > 200 =" + result);
		System.out.println("y = " + y);
		
		/*
		 * &&�� �ǿ����� ���� ��� ���� ��� ���� �������ִ� �������̴�.
		 * ���� �ƴѰ�쿡�� ������ �����Ѵ�.
		 */
		
		result = x < y || y >= 200;
		System.out.println("x < y || y >= 200 =" + result);
		
		result = x < y || y < 200;
		System.out.println("x < y || y < 200 =" + result);
		
		result = x > y || y++ >200;
		System.out.println("x > y || y++ > 200 =" + result);
		System.out.println("y = " + y);
		
		result = x < y || y++ >200;
		System.out.println("x < y || y++ > 200 =" + result);
		System.out.println("y = " + y);
		/*
		 * ||�� �ǿ����� �߿��� �ϳ��� ���̶�� ������ �ǿ������� ���� ������� ���� ��ȯ���ִ� ����̴�.
		 * 
		 */
		
		result = !(x > y);
		System.out.println("!(x > y)=" + result);
		/*
		 * !�� ���� �������� ������ ������ �ٲ��ִ� �������̴�.
		 */
	}

}
