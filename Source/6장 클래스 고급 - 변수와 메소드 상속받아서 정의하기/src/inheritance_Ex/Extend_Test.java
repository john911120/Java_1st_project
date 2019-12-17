package inheritance_Ex;

	/*
	 * 상속 기능 가능한 예제
	 * 작성일 : 1121
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
	 * 상속 테스트
	 */
	public static void main(String[]args) {
		Child child = new Child();
		System.out.println("child.parentVar = " + child.ParentVar);
		System.out.println("child.childVar = " + child.ChildVar);
		child.parentMethod();
		child.childMethod();
	}
		
}
