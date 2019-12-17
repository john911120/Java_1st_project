package 변수타입;

public class DataTypeTest1 {

	public static void main(String[] args) {
		//boolean 연습(논리형 변수)
		boolean var_boolean = true;
		
		//byte 연습(기본형 타입 변수 -128~ 127까지의 2의 보수)
		byte var_byte = 104;
		
		//short 연습(16비트의 기본형 타입 변수 -32768 ~ 32767까지의 16비트)
		short var_short = 741;
		
		//char 연습(16비트의 숫자, 유니코드 0 ~65535)
		char var_char1 = 60;
		char var_char2 = 'J';
		char var_char3 = '\u0041';
		
		//그 이상의 숫자들
		
		/*
		 * int는 32비트의 숫자까지
		 * long은 64비트의 숫자까지
		 * float는 32비트
		 * double은 64비트
		 */
		int var_int = 47174100;
		
		long var_long = 741708;
		
		float var_float = 3.14f;
		
		double var_double = 7.41;
		
		// 출력
		System.out.println("var_boolean= " + var_boolean);
		System.out.println("var_byte=" + var_byte);
		System.out.println("var_short = " + var_short);
		System.out.println("var_char1 = " + var_char1);
		System.out.println("var_char2 = " + var_char2);
		System.out.println("var_char3 = " + var_char3);
		System.out.println("var_int = " + var_int);
		System.out.println("var_long = " + var_long);
		System.out.println("var_float = " + var_float);
		System.out.println("var_double = " + var_double);
	}

}
