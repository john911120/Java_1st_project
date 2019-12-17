package Ex_While;

public class Ex_While03 {
	/*
	 * 구구단을 출력하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * while문2
	 */
	public static void main(String[] args) {
		int danNumber = Integer.parseInt(args[0]);
		if(danNumber >= 2 && danNumber <=9) {
			int num = 1;
			int result = 0;
			while(num <= 9) {
				result = danNumber * num;
				System.out.println(danNumber + "*" + num + "=" + result);
				num ++;
			}
		}
		else {
		System.out.println("단 값이 잘못입력되었습니다.");
		}
	}
}
