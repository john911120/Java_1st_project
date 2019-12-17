package ex_innerClass;

	class OuterClass2{
		private int outerVar = 50;
		private static int outStaticVar = 20;
		
		static class StaticInner
		{
			static int innerVar = 30;
			public void printinfo()
			{
				//System.out.println("outerVar = " + outerVar);
				System.out.println("outerStaticVar = " + outStaticVar);
				System.out.println("innerVar = " + innerVar);
			}

		}
	}


public class ex_StaticinnerrTest {
	/**
	 * static 내부 클래스 테스트
	 * 작성일 : 1127
	 */

	public static void main(String[] args) {
		OuterClass2.StaticInner st = new OuterClass2.StaticInner();
	
		st.printinfo();
	}
}