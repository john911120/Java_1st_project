package Ex_For;

public class Ex_For06 {
	/*
	 * 짝수의 합을 구하는 예제(1부터 30까지)
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * for문
	 */
	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		for(int i = 1; i <= 30; i++) {
			if (i %2==0) {
				sum += i;
				exp += (i==2)?"" + i: "+" +i;
			}
		}
		System.out.println(exp + "=" + sum);
	}

}