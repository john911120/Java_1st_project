package Ex_Do_While;

public class Ex_Do_While01 {
	/*
	 * do While 테스트
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * DO,While문
	 */
	public static void main(String[] args) {
		int i = 0;
		
		//while
		while(i >=1) {
			System.out.println("while area");
		}
		
		//do~while
		do {
			System.out.println("do ~ While Area");
		}
		while(i >= 1);
	}

}
