package Ex_While;

public class Ex_While01 {
	/*
	 * 1부터 30까지의 합을 출력하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * while문
	 */
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 30) {
			sum += i;
			i++;
			
		}
		System.out.println("1부터 30까지의 합은" + sum + "입니다.");
	}

}
