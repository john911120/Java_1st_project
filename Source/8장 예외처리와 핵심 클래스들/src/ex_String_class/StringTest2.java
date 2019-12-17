package ex_String_class;

public class StringTest2 {

	/*
	 	String 클래스의 불변성 테스트
	 	작성일: 1129
	 */
	
	public static void main(String[] args) {
		String originalString = new String("java");
		String lastString = originalString.concat("Oracle DB");
		
		System.out.println("originalString == lastString:" + (originalString == lastString));
	}

}
