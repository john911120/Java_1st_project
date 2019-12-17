package Ex_If;

public class Ex_IF04 {
	/*
	 * 나이대를 판단하여 출력하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * 다중 if문
	 */
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		String generation = "";
		if(age / 10 == 0) {
			generation = "10대 이하";
		}
		else if(age / 10 == 1) {
			generation = "10대";
		}
		else if(age / 10 == 2) {
			generation = "20대";
		}
		else if(age / 10 == 3) {
			generation = "30대";
		}
		else if(age / 10 == 4) {
			generation = "40대";
		}
		else if(age / 10 == 5) {
			generation = "50대";
		}
		else if(age / 10 >= 6) {
			generation = "60대 이상";
		} else {
			generation = "당신은 이 세상 사람이 아닙니다.";
		}
		
		System.out.println("당신은" + generation + "입니다.");
	}

}
