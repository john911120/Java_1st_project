package ex_String_class;

public class StringTest1 {

	/*
	 	문자열 객체 비교 예제
	 	작성일: 1129
	 */
	
	public static void main(String[] args) {
		String string1 = "testString";
		String string2 = "TestString";
		
		System.out.println("string1 == string2: " + (string1 == string2));
		System.out.println("string1.equals(string2):" + (string1.equals(string2)));
		
		String string3 = "testString";
		String string4 = "testString";
		
		System.out.println("string3 == string4: " + (string3 == string4));
		System.out.println("string3.equals(string4):" + (string3.equals(string4)));
	}

}
