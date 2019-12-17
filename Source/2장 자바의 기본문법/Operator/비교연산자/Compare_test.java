package 비교연산자;

public class Compare_test {

	/*
	 * 비교 연산자 테스트 예제
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
		 * >=는 x값이 y값과 같으면 true를 반환한다. 자바에서의 비교 연산자는
		 * ==입니다. =은 대입 연산자일뿐이지 연산자는 아니랍니다.
		 * 
		 * +연산자는 덧셈 연산자로 사용이 되지만 문자열 연결자로도 사용이 됩니다.
		 * +연산자에 의해서 문자열과 문자열이 아닌 다른 타입의 데이터를 연산하면 다른 
		 * 타입의 데이터가 자동으로 문자열 타입으로 변경된 다음 연산을 한다.
		 */
	}

}
