package Ex_For;

public class Ex_For02 {
	/*
	 * 0부터 20까지의 합계를 수직으로 출력하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * for문
	 */
	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		for(int i = 0; i <= 20; i++) {
			sum += i;
			exp += (i==0)?"" + i: "+" +i;
			
		}
		System.out.println(exp + "=" + sum);
	}

}
