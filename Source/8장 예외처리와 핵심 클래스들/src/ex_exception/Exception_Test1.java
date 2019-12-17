package ex_exception;

public class Exception_Test1 {

	/*
	 * 예외 처리 연습(try ~ catch문을 사용하지 않은 예제)
	 * 정수를 0으로 나누기
	 * 작성일 : 1128
	 */
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int result = 10/num;
		System.out.println("result = " + result);
	}

}
