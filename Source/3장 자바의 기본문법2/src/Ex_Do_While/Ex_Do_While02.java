package Ex_Do_While;

import java.util.Scanner;

public class Ex_Do_While02 {
	/*
	 * Scanner 클래스를 사용해서 값을 입력받고 출력하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * DO,While문
	 */
	public static void main(String[] args) {
		// Scanner import
		Scanner sc = new Scanner(System.in);
		
		// next
		String nextString = sc.next();
		System.out.println("nextString ="+ nextString);
		
		// nextInt
		int nextIntNum = sc.nextInt();
		System.out.println("nextIntNum =" + nextIntNum);
	}

}
