package Ex_For;

public class Ex_For08 {
	/*
	 * 삼각형 모향으로 숫자를 출력하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * 다중 for문
	 */
	public static void main(String[] args) {
		int num = 0;
		for(int x = 1; x <= 5;x++) {
			for(int y = 1; y<=x;y++) {
				System.out.print(++num+"\t");
			}
			System.out.println();
		}
		
		num = 0;
		for(int x = 1; x <= 5;x++) {
			for(int y = 1; y<=(6-x);y++) {
				System.out.print(++num+"\t");
			}
			System.out.println();
		}
	}
}
