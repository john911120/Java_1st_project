package 비트연산자;

public class Bit_Operator {
	/*
	 * 비트연산자 테스트 예제
	 * 작성일 : 191102
	 */
	
	public static void main(String[] args) {
		int x = 7;
		int y = 3;
		int result = 0;
		boolean bResult = false;
		
		/*
		 * &, |, ^ 연산자 연습
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
