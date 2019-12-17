package ex_innerClass;

	class OuterClass{
		private int outVar = 100;
		private static int outStaticVar = 20;
		
		class InnerClass
		{
			public void printinfo() {
				System.out.println("outVar = " + outVar);
				System.out.println("outStaticVar = " + outStaticVar);
			}
		}
	}


public class ex_InstanceInnerTest_1 {
	/**
	 * �ν��Ͻ� ���� Ŭ���� �׽�Ʈ
	 * �ۼ��� : 1127
	 */

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass in = oc.new InnerClass();
	
		in.printinfo();
	}
}