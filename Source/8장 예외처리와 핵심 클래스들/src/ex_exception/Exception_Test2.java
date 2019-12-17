package ex_exception;

public class Exception_Test2 {

	/*
	 * 예외 처리 연습(try ~ catch문을 사용한 예제)
	 * 정수를 0으로 나누기
	 * 작성일 : 1128
	 */
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10/num;
			System.out.println("result = " + result);
		} catch(ArithmeticException e){
			System.out.println("정수를 0으로 나누면 병신으로 만들어주마");
		}
		System.out.println("프로그램 계속 실행");
	}

}
