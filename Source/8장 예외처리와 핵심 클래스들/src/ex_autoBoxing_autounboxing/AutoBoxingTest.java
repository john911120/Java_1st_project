package ex_autoBoxing_autounboxing;

public class AutoBoxingTest {
	
	/*
		autoboxing/unboxing예제 구현하기
		- 오토박싱 : 기본 타입의 데이터를 객체 타입의 데이터에 할당하면 기본 타입의 데이터가 객체 타입의 
		           데이터로 자동 변환되면서 레퍼런스 변수에 할당된다.
		- 언박싱: 객체 타입의 데이터를 기본 타입의 변수에 할당하면 자동으로 객체 타입의 데이터가 기본타입으로
				변경되면서 할당
		작성일 : 1130
	*/
	public static void main(String[] args) {
		// jdk 1.4버전 이하의 오토박싱과 언박싱
		int var_int1 = 3;
		Integer intObj1 = new Integer(var_int1);
		
		Integer intObj2 = new Integer("4");
		int var_int2 = intObj2.intValue();
		
		// jdk 1.5버전 이상의 오토박싱과 언박싱
		intObj1 = var_int1;
		System.out.println("intObj1 =" + intObj1);
		
		var_int2 = intObj2;
		System.out.println("var_int2 = " + var_int2);
	}
	
}
