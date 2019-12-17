package Ex_Switch;

public class Ex_Switch03 {
	/*
	 * 나이를 입력 받아서 나이대를 입력하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * switch문
	 */
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		String generation = "";
		switch(age) {
		case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:
			generation = "10대 이하";
			break;
		case 10:case 11:case 12:case 13:case 14:case 15:case 16:case 17:case 18:case 19:
			generation = "10대";
			break;
		case 20:case 21:case 22:case 23:case 24:case 25:case 26:case 27:case 28:case 29:
			generation = "20대";
			break;
		case 30:case 31:case 32:case 33:case 34:case 35:case 36:case 37:case 38:case 39:
			generation = "30대";
			break;
		case 40:case 41:case 42:case 43:case 44:case 45:case 46:case 47:case 48:case 49:
			generation = "40대";
			break;
		case 50:case 51:case 52:case 53:case 54:case 55:case 56:case 57:case 58:case 59:
			generation = "50대";
			break;
		default:
			generation = "60대 이상 이거나 고인";
		}
		System.out.println("당신은 " + generation + "입니다.");
		
	}

}
