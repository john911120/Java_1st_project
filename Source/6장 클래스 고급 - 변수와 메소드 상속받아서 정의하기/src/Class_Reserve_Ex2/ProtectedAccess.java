package Class_Reserve_Ex2;

public class ProtectedAccess {

	/*
	 * protected 와 같은 접근 제한자는 같은 패키지 내에서는 접근 가능하지만
	 * 다른 패키지는 접근이 안된다. 다른 패키지의 경우에는 자식 클래스에서만 접근이 가능한
	 * 접근 제한자이다.
	 * 
	 * 작성일 : 1122
	 */
	
	public static void main(String[] args) {
		ProtectedData pd = new ProtectedData();
		System.out.println(pd.protectedVar);
	}

}
