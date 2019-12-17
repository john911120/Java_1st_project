package 복합연산자;

public class Complex_Operator {
	/*
	 * 복합 연산자 테스트 예제
	 * 작성일 : 191102
	 */
	
	public static void main(String[] args) {
		int x = 5;
		
		/*
		 * +=, -=, *=, /=, %= 
		 * 연산 다음 대입연산자는 복합 연산자에 지정된 대입 연산자가 아닌
		 * 다른 연산을 먼저 실행하고 연산 결과를 변수에 대입한다.
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