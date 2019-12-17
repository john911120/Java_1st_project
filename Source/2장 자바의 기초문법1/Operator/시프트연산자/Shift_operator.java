package 시프트연산자;

public class Shift_operator {
	/*
	 * 시프트 연산자 테스트 예제
	 * 작성일 : 191102
	 */
	
	public static void main(String[] args) {
		/*
		 * 해당 값을 비트로 바꾸고 나서 왼쪽이나 오른쪽으로 지정한 자리수 만큼
		 * 이동시켜주는 연산자이다.
		 */
		int x = 3;
		int result = 0;
		
		/*
		 *  <<는 좌측으로 해당 값 만큼 비트를 이동시키고, 우측 빈공간을
		 *  0으로 채운다.
		 */
		result = x << 2;
		System.out.println("x <<2 =" + result);
		
		/*
		 * >>는 오른쪽으로 비트를 이동시키며, 부호 비트 이동이다. 
		 * 만약 맨 좌측 비트가 1이라고 가정하면 오른쪽으로 비트 이동하면서 
		 * 남는 비트 영역을 부호비트로 채운다.
		 */
		x = -1;
		result = x >> 1;
		System.out.println("x >> 1 =" + result);
		
		/*
		 * >>>는 오른쪽으로 비트 이동, 비부호 비트 이동
		 * 오른쪽으로 비트 이동하면서 좌측에 비는 비트영역을 무조건 0으로 채운다.
		 */
		result = x >>> 1;
		System.out.println("x >>> 1 =" + result);
	}

}
