package inheritance_Ex;

	/*
	 * overriding 예제
	 * 작성일 : 1121
	 */
	class OverridingParent{
		void parentMethod() {
			System.out.println("parent method");
		}
	}
	class OverridingChild extends OverridingParent{
		void parentMethod() {
			System.out.println("overriding method");
		}
	}
	

public class OverringTest1 {
	/*
	 * 상속 테스트
	 */
	public static void main(String[]args) {
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
	}
		
}
