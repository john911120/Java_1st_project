package ex_exception;

public class Exception_Test6A {
	/*
	 * 예외 처리 연습(일반Exception 예제)
	 * throw : 예외 객체를 임의적으로 만들어서 발생시켜주는 예약어
	 * 작성일 : 1128
	 */
	public void exceptionMethod() {
		//throw new NullPointerException();
		
		/* 일반 exception 에러 발생한다.
		throw new ClassNotFoundException();
		*/
	}
	
	public static void main(String[] args) {
		Exception_Test6A et6 = new Exception_Test6A();
		et6.exceptionMethod();
	}

}
