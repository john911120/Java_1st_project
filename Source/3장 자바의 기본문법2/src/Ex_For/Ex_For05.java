package Ex_For;

public class Ex_For05 {
	/*
	 * 입력받은 정수로 부터 1까지의 합을 구하는  예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * for문
	 */
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		String exp = "";
		
		for(int i = num; i >= 1; i--) {
			sum += i;
			exp += (i==num)?"" + i: "+" +i;
			
		}
		System.out.println(exp + "=" + sum);
	}

}