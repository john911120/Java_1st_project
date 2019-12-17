package inheritance_Ex;

	/*
	 * overriding 예제
	 * 자식 클래스에서 변수를 재정의 한 경우
	 * 작성일 : 1121
	 */
	class OverridingParent2{
		int money = 20;
		void parentMethod() {
			System.out.println("parent Method");
		}
	}
	class OverridingChild2 extends OverridingParent2{
		String money = "20원";
		void parentMethod() {
			System.out.println("overriding Method");
		}
	}
	
public class OverringTest2 {
	/*
	 * 상속 테스트
	 */

	public static void main(String[]args) {
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.parentMethod();
		oc2.money="30원";
		System.out.println("oc2.money =" + oc2.money);
	}
}