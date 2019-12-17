package Class_Reserve_Ex2;

public class ProtectedAccess2 extends ProtectedData {

	/*
	 * protected 와 같은 접근 제한자는 같은 패키지 내에서는 접근 가능하지만
	 * 다른 패키지는 접근이 안된다. 다른 패키지의 경우에는 자식 클래스에서만 접근이 가능한
	 * 접근 제한자이다. 패키지가 달라도 자식 클래스에서는 접근이 가능하다.
	 * 다른 패키지에서 결과를 출력하고자 한다면 ProtectedData클래스를 상속 받아서 정의해야한다.
	 * 작성일 : 1122
	 */
	void printVar() {
		System.out.println("protectedVar = " + protectedVar);
	}
	
	
	public static void main(String[] args) {
		ProtectedAccess2 pa = new ProtectedAccess2();
		pa.printVar();
	}

}
