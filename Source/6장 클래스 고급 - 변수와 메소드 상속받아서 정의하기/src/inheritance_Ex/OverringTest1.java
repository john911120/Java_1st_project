package inheritance_Ex;

	/*
	 * overriding ����
	 * �ۼ��� : 1121
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
	 * ��� �׽�Ʈ
	 */
	public static void main(String[]args) {
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
	}
		
}
