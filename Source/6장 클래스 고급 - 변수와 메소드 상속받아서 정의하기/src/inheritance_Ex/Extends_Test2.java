package inheritance_Ex;

/*
 * ���� Ŭ������ ��ӹ��� Ŭ������ �ٸ� Ŭ������ ������ ���
 * �ۼ��� : 1121
 */
	class Super{
		int x = 90;
		void superMethod() {
			System.out.println("super Method");
		}
	}

	class Sub extends Super{
		int y = 10;
		void subMethod() {
			System.out.println("sub Method");
		}
	}
	class Subsub extends Sub{
		int z = 20;
		void subSubMethod() {
			System.out.println("subSub Method");
		}
	}
	
public class Extends_Test2 {

	public static void main(String[] args) {
		// 2�ܰ� ��� �׽�Ʈ
		Subsub ss = new Subsub();
		System.out.println("ss.x = " + ss.x);
		System.out.println("ss.y = " + ss.y);
		System.out.println("ss.z = " + ss.z);
		
		ss.subMethod();
		ss.subMethod();
		ss.subSubMethod();
	}

}
