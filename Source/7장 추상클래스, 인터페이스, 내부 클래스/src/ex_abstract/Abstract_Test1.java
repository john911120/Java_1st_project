package ex_abstract;

	abstract class AbstractClass{
		// ���� ����
		int age;
		
		// ������ �޼ҵ�
		void generalMethod() {
			System.out.println("�Ϲ� �޼ҵ�");
		}
		// �߻� �޼ҵ�
		abstract void abstractMethod();
	}
	
	class AbstractChildClass extends AbstractClass{

		@Override
		void abstractMethod() {
			System.out.println("�߻� �޼ҵ� ����");
		}
		
	}

public class Abstract_Test1 {
	
	/*
	 * �߻�Ŭ���� ���� ����
	 * �ۼ��� : 1125
	 */
	public static void main(String[] args) {
		// �߻�Ŭ������ ��ü ����
		//AbstractClass ac = new AbstractClass();
	
		//�ڽ� Ŭ������ ��ü �����ϱ�
		AbstractChildClass acc = new AbstractChildClass();
		acc.abstractMethod();
		System.out.println(acc.age);
		acc.generalMethod();
	}

}
