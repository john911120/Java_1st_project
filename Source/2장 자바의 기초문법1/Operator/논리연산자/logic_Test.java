package 논리연산자;

public class logic_Test {

	/*
	 * 논리 연산자 테스트 예제
	 * 작성일 : 191101
	 */
	
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		boolean result = false;
		
		// &&, ||, ! 연산자
		result = x < y && y >= 200;
		System.out.println("x < y && y >= 200 =" + result);
		
		result = x < y && y < 200;
		System.out.println("x < y && y < 200 =" + result);
		
		result = x > y && y++ >200;
		System.out.println("x > y && y++ > 200 =" + result);
		System.out.println("y = " + y);
		
		/*
		 * &&는 피연산자 값이 모두 참일 경우 참을 리턴해주는 연산자이다.
		 * 참이 아닌경우에는 거짓을 리턴한다.
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
		 * ||는 피연산자 중에서 하나라도 참이라면 나머지 피연산자의 값에 관계없이 참을 반환해주는 기능이다.
		 * 
		 */
		
		result = !(x > y);
		System.out.println("!(x > y)=" + result);
		/*
		 * !는 참을 거짓으로 거짓을 참으로 바꿔주는 연산자이다.
		 */
	}

}
