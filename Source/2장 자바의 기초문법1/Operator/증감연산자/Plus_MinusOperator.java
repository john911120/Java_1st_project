package 증감연산자;

public class Plus_MinusOperator {
	/*
	 * 증감 연산자 테스트 예제
	 * 작성일 : 191102
	 */
	
	public static void main(String[] args) {
		int var_inc = 1;
		int var_dec = 1;
		int result = 0;
		
		//++, -- 연산자 연습
		
		/*
		 * 변수 값을 1씩 증가시키거나 1씩 감소시키는 연산자로 위치에 따라서 
		 * 값이 달라지게 된다 앞에오면 증감 연산자가 먼저 실행되고 다른 연산을 실행하고
		 * 뒤에 오면 다른 연산 먼저 실행하고 증감 연산자를 실행한다.
		 */
		result = var_inc++;
		System.out.println("result = " + result);
		System.out.println("var_inc = " + var_inc);
		
		result = ++var_inc;
		System.out.println("result = " + result);
		System.out.println("var_inc = " + var_inc);
		
		result = var_dec--;
		System.out.println("result = " + result);
		System.out.println("var_dec = " + var_dec);

		result = --var_dec;
		System.out.println("result = " + result);
		System.out.println("var_dec = " + var_dec);

		
	}

}
