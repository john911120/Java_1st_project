package Ex_For;

public class Ex_For04 {
	/*
	 * 40부터 2씩 감소시키면서  합계를 출력하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * for문
	 */
	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		for(int i = 40; i >= 1; i--) {
			sum += i;
			exp += (i==40)?"" + i: "+" + i;
			
		}
		System.out.println(exp + "=" + sum);
	}

}
