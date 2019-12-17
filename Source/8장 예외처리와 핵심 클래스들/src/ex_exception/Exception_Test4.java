package ex_exception;

public class Exception_Test4 {

	/*
	 * 예외 처리 연습(try ~ catch~Finally문을 사용하지 않은 예제)
	 * 작성일 : 1128
	 */
	public void exceptionMethod(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10 / num;
			System.out.println("result = " + result);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("인자를 하나 입력하세요");
		}
		catch(NumberFormatException e) {
			System.out.println("인자를 정수 타입으로 입력하세요");
		}
		catch(ArithmeticException e) {
			System.out.println("정수를 0으로 나누면 병신을 만들어주마");
		}
		System.out.println("시스템 자자 이리로왓!");
	}
		
	public static void main(String[] args) {
		Exception_Test4 et4 = new Exception_Test4();
		et4.exceptionMethod(args);
	}
}
