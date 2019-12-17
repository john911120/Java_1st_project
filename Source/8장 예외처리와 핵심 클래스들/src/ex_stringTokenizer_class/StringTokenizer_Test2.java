package ex_stringTokenizer_class;

import java.util.StringTokenizer;

public class StringTokenizer_Test2 {

	/*
		StringTokenizer ""(공백)을 구분자로 사용한 경우
		작성일 : 1201
		
	*/
	public static void main(String[] args) {
		/*
		 * 나라이름을 공백으로 두었다.
		 */
		String source1 = "한국 일본 미국 중국 러시아";
		StringTokenizer st1 = new StringTokenizer(source1);
		while(st1.hasMoreTokens()) {
			System.out.println("st1 token: " + st1.nextToken());
		}
		System.out.println();
		System.out.println();
		
		/*
		 	","을 사용함
		 */
		String source2 = "한국,일본,미국,중국,러시아";
		StringTokenizer st2 = new StringTokenizer(source2,",");
		while(st2.hasMoreTokens()) {
			System.out.println("st2 token: " + st2.nextToken());
		}
		System.out.println();
		System.out.println();
		
		StringTokenizer st3 = new StringTokenizer(source2, ",", true);
		while(st3.hasMoreTokens()) {
			System.out.println("st3 token: " + st3.nextToken());
		}
	}

}
