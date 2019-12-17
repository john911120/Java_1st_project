package Ex_For;

public class Ex_For07 {
	/*
	 * 다중For문 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * 다중 for문
	 */
	public static void main(String[] args) {
		for(int outer = 1; outer<=3; outer++) {
			for(int inner = 1; inner<=3; inner++) {
				System.out.println("outer = " + outer + ",inner = " + inner);
			}
		}
	}

}
