package ���տ�����;

public class Complex_Operator {
	/*
	 * ���� ������ �׽�Ʈ ����
	 * �ۼ��� : 191102
	 */
	
	public static void main(String[] args) {
		int x = 5;
		
		/*
		 * +=, -=, *=, /=, %= 
		 * ���� ���� ���Կ����ڴ� ���� �����ڿ� ������ ���� �����ڰ� �ƴ�
		 * �ٸ� ������ ���� �����ϰ� ���� ����� ������ �����Ѵ�.
		 */		
		// += 
		x += 5;
		System.out.println("x += 5 =" + x);
		x += 3.1;
		System.out.println("x += 3.1 = " + x);
		
		// -= 
		x -= 5;
		System.out.println("x -= 5 =" + x);
		
		// *= 
		x *= 2;
		System.out.println("x *= 2 =" + x);
		
		// /= 
		x /= 2;
		System.out.println("x /= 2 =" + x);
		
		// %= 
		x %= 2;
		System.out.println("x %= 2 =" + x);
	}

}