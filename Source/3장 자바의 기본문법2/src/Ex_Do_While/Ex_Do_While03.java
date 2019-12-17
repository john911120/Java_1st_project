package Ex_Do_While;

import java.util.Scanner;

public class Ex_Do_While03 {
	/*
	 * Scanner 클래스를 활용해서 난수 값을 맞추는 예제 프로그램
	 * 난수 범위를 1~ 10까지로 설정한다.
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * DO,While문
	 */
	public static void main(String[] args) {
		// Scanner import
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random()*10)+1;
		int inNumber = 0;
		
		do {
			System.out.println("숫자를 입력하세요");
			inNumber = sc.nextInt();
			
			if(inNumber == number) {
				System.out.println("정답입니다.");
				break;
			}
			else if(inNumber < number){
				System.out.println("숫자가 너무 작습니다.");
			} else {
				System.out.println("숫자가 너무 큽니다.");
			}
		}
		while(true);
	}

}
