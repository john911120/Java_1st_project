package Ex_Switch;

public class Ex_Switch02 {
	/*
	 * 직급별 연봉을 출력하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * switch문(break 예약어 제거 Ver.)
	 */
	public static void main(String[] args) {
		String job = args[0];
		int salary = 0;
		switch(job) {
		case"사원":
			salary = 2000000;
		case"대리":
			salary = 2500000;
		case"과장":
			salary = 3500000;
		case"부장":
			salary = 4500000;
		}
		System.out.println("당신의 연봉은 " + salary + "원 입니다.");
		
	}

}
