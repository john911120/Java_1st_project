package ex_String_class;

public class StringTest3 {

	/*
	 	StringBuffer 클래스 테스트
	 	작성일: 1129
	 */
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		StringBuffer sb2 = sb.append("Oracle DB");
		
		System.out.println("sb == sb2:" + (sb == sb2));
	}

}
