package Ex_Continue;

import java.util.Scanner;

public class Ex_Continue {
	/*
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * Continue문
	 */
	public static void main(String[] args) {
		aaa: for(char c = 'A'; c<='C';c++) {
			for(int x = 1; x<=3; x++) {
				if(x==2)continue;
				if(c=='B')continue aaa;
				System.out.println("c =" + c + ",x=" + x);
			}
		}
		
	}

}
