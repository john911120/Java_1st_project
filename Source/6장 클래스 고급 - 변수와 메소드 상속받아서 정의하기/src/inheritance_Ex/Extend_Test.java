package inheritance_Ex;

	/*
	 * ��� ��� ������ ����
	 * �ۼ��� : 1121
	 */
	class Parent{
		int ParentVar = 10;
		void parentMethod() {
			System.out.println("parent method");
		}
	}
	class Child extends Parent{
		int ChildVar = 20;
		void childMethod() {
			System.out.println("child method");
		}
	}
	

public class Extend_Test {
	/*
	 * ��� �׽�Ʈ
	 */
	public static void main(String[]args) {
		Child child = new Child();
		System.out.println("child.parentVar = " + child.ParentVar);
		System.out.println("child.childVar = " + child.ChildVar);
		child.parentMethod();
		child.childMethod();
	}
		
}
