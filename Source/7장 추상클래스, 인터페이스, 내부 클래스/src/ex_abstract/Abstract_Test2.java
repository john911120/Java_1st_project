package ex_abstract;

	abstract class AbClass1{
		abstract void abMethod();
		
	}
	abstract class AbClass2 extends AbClass1{
		abstract void AbMethod2();
	}
	
	class GeneralClass extends AbClass2{

		@Override
		void abMethod() {
			System.out.println("abMethod1 �޼ҵ� ����");
		}
		
		@Override
		void AbMethod2() {
			System.out.println("abMethod2 �޼ҵ� ����");
		}
		
	}
	

public class Abstract_Test2 {
	
	/*
	 * �߻�Ŭ���� ������ ��� ����
	 * �ۼ��� : 1125
	 */
	public static void main(String[] args) {
		GeneralClass gc = new GeneralClass();
		gc.abMethod();
		gc.AbMethod2();
	}

}
