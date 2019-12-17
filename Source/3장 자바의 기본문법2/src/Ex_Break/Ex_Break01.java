package Ex_Break;

import java.util.Scanner;

public class Ex_Break01 {
	/*
	 * 수도를 입력 받아서 결과를 출력하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * break문
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "서울";
		String inString = "";
		do {
			System.out.println("한국의 수도는 무엇인가요?");
			inString = sc.next();
			if(inString.contentEquals(answer)) {
				System.out.println("대한민국의 수도는" + answer + "입니다.");
				break;
			} 
			System.out.println("틀렸습니다. 다시 입력하세요");
		}
		while(true);
		
	}

}
