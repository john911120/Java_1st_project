package ex_innerClass;

	class OuterClass3{
		private int outerVar = 70;
		private static int staticOuterVar = 30;
		
		void printinfo() {
			int localVar = 3;
			final int finalLocal = 4;
			class LocalinnerClass{
				void displayinfo() {
					System.out.println("outerVar = " + outerVar);
					System.out.println("staticOuterVar = " + staticOuterVar);
					System.out.println("finalLocal = " + finalLocal);
				}
			}
			
			LocalinnerClass lc = new LocalinnerClass();
			lc.displayinfo();
		}
	}


public class ex_LocalInnerTest {
	/**
	 * local 내부 클래스 테스트
	 * 작성일 : 1127
	 */

	public static void main(String[] args) {
		OuterClass3 oc = new OuterClass3();
		oc.printinfo();
	}
}