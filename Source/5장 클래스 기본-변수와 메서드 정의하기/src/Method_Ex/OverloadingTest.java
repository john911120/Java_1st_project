package Method_Ex;

public class OverloadingTest {
	
	/*
	 * 인수 전달 방식 연습 예제4
	 * 작성일  : 1115
	 * 같은 이름의 메소드를 한 클래스에 여러개 정의 할 수 있는 기능을 의미한다. 여기서 지켜야할 규칙은 3개
	 * 1. 파라미터의 타입이나 개수가 달라야한다.
	 * 2. 파라미터의 이름은 오버로딩 성립에 영향을 주지는 않는다.
	 * 3. 리턴 타입은 오버로딩 성립에 영향을 주지 않는다.
	 */
	
	public static void main(String[] args) {
		Boiler bo = new Boiler();
		System.out.println("현재 온도 = " + bo.temp);
		bo.tempUP();
		System.out.println("bo.tempUP() 메소드 호출 후 현재 온도 =" + bo.temp);
		bo.tempUp(20);
		System.out.println("bo.tempUp() 메소드 호출 후 현재 온도 = " + bo.temp);
	}

}
