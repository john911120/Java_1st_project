package inheritance_Ex;

	/*
	 * overriding ����
	 * �ڽ� Ŭ�������� ������ ������ �� ���
	 * �ۼ��� : 1121
	 */
	class OverridingParent2{
		int money = 20;
		void parentMethod() {
			System.out.println("parent Method");
		}
	}
	class OverridingChild2 extends OverridingParent2{
		String money = "20��";
		void parentMethod() {
			System.out.println("overriding Method");
		}
	}
	
public class OverringTest2 {
	/*
	 * ��� �׽�Ʈ
	 */

	public static void main(String[]args) {
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.parentMethod();
		oc2.money="30��";
		System.out.println("oc2.money =" + oc2.money);
	}
}