package ex_String_class;

public class StringTest4 {

	/*
	 	String 클래스의 메소드 사용
	 	작성일: 1129
	 */
	
	public static void main(String[] args) {
		String source1 = "aabbccddeeffggaabbccddeeff";
		String source2 = "AAbbccddeeffggaabbccddeeff";
		
		System.out.println("원본 문자열:" + source1);
		System.out.println("첫 번째 문자:  + source1.charAt(0): " + source1.charAt(0));
		
		System.out.println("네 번째 문자:  + source1.charAt(3): " + source1.charAt(3));
		
		System.out.println("aaa 문자열의 인덱스 : source1.indexOf(\"aaa\") :" + source1.indexOf("aaa"));
		
		System.out.println("aaa 문자열의 뒤에서부터 검색한 위치:" + "source1.lastindexOf(\"aaa\"):" + source1.lastIndexOf("aaa"));
		
		System.out.println("3번 인덱스 문자로부터 마지막 문자까지 출력: + source1.substring(3):" + source1.substring(3));
		
		System.out.println("3번 인덱스 부터 5번 인덱스까지 출력: + source1.substring(3, 6):" + source1.substring(3, 6));
		
		System.out.println("aaa문자열을 ggg로 변경하기: + source1.replace(\"aaa\", \"ggg\"):" + source1.replace("aaa", "ggg"));
		
		System.out.println("source1 문자열이 aaa로 시작되는지 확인: + source1.endsWith(\"aaa\"):" + source1.startsWith("aaa"));
		
		System.out.println("source1 문자열에 aaa 문자열이 포함되어 있는가를 판단: + source1.contains(\"aaa\"):" + source1.contains("aaa"));
		
		System.out.println("source1 문자열의 길이: + source1.length():" + source1.length());
		
		System.out.println("source1과 source2의 비교: + source1.equals(source2):" + source1.equals(source2));
		
		System.out.println("source1과 source2의 대소문자 무시한 비교: + source1.equalsignoreCase(source1):" + source1.equalsIgnoreCase(source1));
		
		System.out.println("source2 전체를 대문자로 변경하기: + source2.toUpperCase():" + source2.toUpperCase());
		
		System.out.println("source2 전체를 소문자로 변경하기: + source2.toLowerCase():" + source2.toLowerCase());
		
		String source3 = "aaa,bbb,ccc";
		System.out.println("원본 문자열:" + source3);
		String[] splitStr = source3.split(",");
		
		System.out.println("source3.split(\"|\")으로 반환된 배열 요소");
		
		for(String str: splitStr) {
			System.out.println(str);
		}
		System.out.println();
		
		String source4 = "java";
		System.out.println("원본 문자열:" + source4 + "");
		System.out.println("공백 제고후 source4 문자열: source4.trim():" + source4.trim() + "");
		
	}

}
