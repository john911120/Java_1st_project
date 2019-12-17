package 삼항연산자;

public class Triple_Operator {
	/*
	 * 3항 연산자 테스트 예제
	 * 작성일 : 191102
	 */
	
	public static void main(String[] args) {
		/*
		 *  삼항 연산자는 하나의 조건에 대해서 조건을 만족 할 때 반환될 값과
		 *  조건을 만족하지 않을 때 반환된 값을 정의하는 연산자이다.
		 */

		int num = Integer.parseInt(args[0]);
		String msg = (num % 2 == 0)? "짝수":"홀수";
		System.out.println(num + "은" + msg + "입니다.");
	}

}
