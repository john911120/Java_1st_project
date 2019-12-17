package ex_exception;

public class Exception_Test6 {
	/*
	 * 예외 처리 연습(RuntimeException 예제)
	 * throw : 예외 객체를 임의적으로 만들어서 발생시켜주는 예약어
	 * 작성일 : 1128
	 */
	public void exceptionMethod() {
		throw new NullPointerException();
	}
	
	public static void main(String[] args) {
		Exception_Test6 et6 = new Exception_Test6();
		et6.exceptionMethod();
	}

}
