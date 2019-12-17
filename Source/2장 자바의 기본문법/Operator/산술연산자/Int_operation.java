package 산술연산자;

public class Int_operation {

	/*
	 * 산술 연산자 연산 연습
	 */
	public static void main(String[] args) {
		int result = 0;
		int var_int1 = 10;
		int var_int2 = 90;
		int var_int3 = 10;
		int var_int4 = 2;
		
		//+, -, *, /, % 순으로 연산한다.
		result = var_int1 + var_int2;
		System.out.println("var_int1 + var_int2 = " + result);
		
		result = var_int1 - var_int2;
		System.out.println("var_int1 - var_int2 = " + result);
		
		result = var_int1 * var_int2;
		System.out.println("var_int1 * var_int2 = " + result);
		
		result = var_int3 / var_int4;
		System.out.println("var_int3 / var_int4 = " + result);
		
		result = var_int1 % var_int2;
		System.out.println("var_int1 % var_int2 = " + result);

	}

}
