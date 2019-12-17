
public class Convert_test1 {
	
	/*
	 * 형 변환을 위한 예제
	 * 작성일 : 20191030
	 */
	
	public static void main(String[] args) {
		
		//큰 타입으로 변환하기
		byte var_byte1 = 10;
		int var_int1 = var_byte1;
		System.out.println("var_int1 =" + var_int1);
		
		//명시적 형 변환하기 : 큰 타입의 값을 작은 타입의 변수에 할당하기
		//명시적으로 형을 변환해주지 않는다면 컴파일 오류가 발생하기 때문이다.
		int var_int2 = 100;
		byte var_byte2 = (byte) var_int2;
		
		//char, short
		short var_short1 = 200;
		char var_char1 = (char) var_short1;
		System.out.println("var_char1 = " + var_char1);
		
		//int 타입보다 작은 타입의 정수 연산 : int형으로 변환됨
		//int형보다 작은 타입의 변수에 값을 할당하려면 명시적으로 형을 변환해줘야한다.
		byte var_byte3 = 20;
		byte var_byte4 = 40;
		byte var_result1 =(byte)(var_byte3 + var_byte4);
		
		char var_char2 = 'A';
		int var_int_result1 = var_char2 + 1;
		System.out.println("var_int_result1 = " + var_int_result1);
		
		//연산 할때  피연산자 중 보다 큰 타입으로 형 전환된 후 연산된다.
		int var_int3 = 100;
		long var_long1 = 100;
		long var_long_result1 = var_int3 + var_long1;
		System.out.println("var_long_result1 = " + var_long_result1);
		
		
		//정수와 실수를 연산하면 실수타입으로 자동적으로 형이 변환된다.
		long var_long2 = 100;
		float var_float1 = 3.14f;
		float var_float_result1 = var_long2 + var_float1;
		System.out.println("var_float_result1 = " + var_float_result1);
		
		//float타입과 double타입을 연산하면 double타입으로 변환된다.
		float var_float2 = 3.33f;
		double var_double3 = 4.22;
		/*
		 * 같은 실수 타입끼리 연산할 때는 당연히 바이트 수가 더 큰 타입으로 형 변환 된 다음에 연산된다. 
		 * float타입과 double타입을 연산하면 double타입의 데이터 결과값으로 반환한다.
		 */
		double var_double_result2 = var_float2 + var_double3;
		System.out.println("var_long_result2 = " + var_double_result2);
	}

}
