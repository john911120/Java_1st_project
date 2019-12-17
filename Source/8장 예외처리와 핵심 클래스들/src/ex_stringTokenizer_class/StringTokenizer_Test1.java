package ex_stringTokenizer_class;

import java.util.StringTokenizer;

public class StringTokenizer_Test1 {

	/*
		지정한 문자열을 특정 구분자로 분리해서 분리된 문자열들을 토큰으로 반환해주는 클래스이다.
		특정 데이터들이 특정 구분자로 구분되어 제공 될 때 해당 데이터들을 구분자로 분리하여 데이터를 추출 할 수 있다.
		작성일 : 1201
		
	*/
	public static void main(String[] args) {
		//|을 구분자로 사용한 경우
		/*
		 * 우편번호와 시 군 구 동 건물을 |으로 구분했다.
		 */
		String source1 = "135-802|서울시|강남구|개포동|강남구청";
		StringTokenizer st1 = new StringTokenizer(source1,"|");
		String zip = st1.nextToken();
		String shi = st1.nextToken();
		String gu = st1.nextToken();
		String dong = st1.nextToken();
		String build = st1.nextToken();
		
		// 출력하기
		System.out.println("우편번호:" + zip);
		System.out.println("시:" + shi);
		System.out.println("구:" + gu);
		System.out.println("동:" + dong);
		System.out.println("건물:" + build);
	}

}
