package Ex_If;

public class Ex_IF03 {
	/*
	 * 해당 연도가 윤년인지 아닌지를 판단하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * if else문 활용 예제
	 */
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		boolean isLeap = false;
		isLeap = (year%4==0 && year % 100 != 0 || year % 400 == 0);
		if(isLeap) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}

}
