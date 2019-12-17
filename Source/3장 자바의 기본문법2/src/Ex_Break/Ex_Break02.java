package Ex_Break;

import java.util.Scanner;

public class Ex_Break02 {
	/*
	 * 지정한 영역의 반복문으로 빠져 나가는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * break문
	 */
	public static void main(String[] args) {
		int num = 0;
		char c = 'A';
		aaa: while(true) {
			while(true) {
				num++;
				System.out.print(c++ +"");
				if(num % 5 == 0) {
					break;
				}
				if(num == 26) {
					break aaa;
				}
			}
			System.out.println();
		}
		
	}

}
