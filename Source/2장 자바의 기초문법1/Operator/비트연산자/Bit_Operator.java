package ��Ʈ������;

public class Bit_Operator {
	/*
	 * ��Ʈ������ �׽�Ʈ ����
	 * �ۼ��� : 191102
	 */
	
	public static void main(String[] args) {
		int x = 7;
		int y = 3;
		int result = 0;
		boolean bResult = false;
		
		/*
		 * &, |, ^ ������ ����
		 */
		result = x & y;
		System.out.println("x & y = " + result);
		bResult = true & false;
		System.out.println("true & false = " + bResult);
		
		result = x | y;
		System.out.println("x | y = " + result);
		bResult = true | false;
		System.out.println("true | false = " + bResult);
		
		result = x ^ y;
		System.out.println("x ^ y = " + result);
		bResult = true ^ false;
		System.out.println("true ^ false = " + bResult);
	}

}
