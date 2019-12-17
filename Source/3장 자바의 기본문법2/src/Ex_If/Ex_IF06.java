package Ex_If;

public class Ex_IF06 {
	/*
	 * 수식을 입력받아 사칙연산을 하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * 다중 if문 예제
	 */
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		String operation = args[1];
		int result = 0;
		
		
		if(operation.equals("+")) {
			result = num1 + num2;
		}
		else if(operation.equals("-")) {
			result = num1 - num2;
		}
		else if(operation.equals("/")) {
			result = num1 / num2;
		}
		else if(operation.equals("X")) {
			result = num1 * num2;
		}
		if(result != 0) {
			System.out.println(num1 + operation + num2 + "=" + result);
		} else {
			System.out.println("연산자가 잘못되었습니다.");
		}
		
	}
	
}
