package �񱳿�����;

public class Compare_test {

	/*
	 * �� ������ �׽�Ʈ ����
	 */
	
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		boolean result = false;
		
		// >, <,  >=, <=, <=, !=
		result = x > y;
		System.out.println("x > y = " + result);
		
		result = x < y;
		System.out.println("x < y = " + result);
		
		result = x >= y;
		System.out.println("x >= y = " + result);
		
		result = x <= y;
		System.out.println("x <= y = " + result);
		
		result = x == y;
		System.out.println("x == y = " + result);
		
		result = x != y;
		System.out.println("x <= y = " + result);
		
		/*
		 * >=�� x���� y���� ������ true�� ��ȯ�Ѵ�. �ڹٿ����� �� �����ڴ�
		 * ==�Դϴ�. =�� ���� �������ϻ����� �����ڴ� �ƴ϶��ϴ�.
		 * 
		 * +�����ڴ� ���� �����ڷ� ����� ������ ���ڿ� �����ڷε� ����� �˴ϴ�.
		 * +�����ڿ� ���ؼ� ���ڿ��� ���ڿ��� �ƴ� �ٸ� Ÿ���� �����͸� �����ϸ� �ٸ� 
		 * Ÿ���� �����Ͱ� �ڵ����� ���ڿ� Ÿ������ ����� ���� ������ �Ѵ�.
		 */
	}

}
