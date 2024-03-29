package ex_exception;

public class Exception_Test7 {
	/*
	 * 예외 처리 연습(throws 예제)
	 * throw : 예외 객체를 임의적으로 만들어서 발생시켜주는 예약어
	 * 작성일 : 1128
	 */
	public void exceptionMethod() throws Exception {
		throw new Exception();
	}
	
	public static void main(String[] args) {
		Exception_Test7 et7 = new Exception_Test7();
		try {
			et7.exceptionMethod();
		} catch(Exception e) {
			System.out.println("호출한 메소드에서 예외 처리함");
		}
	}

}
