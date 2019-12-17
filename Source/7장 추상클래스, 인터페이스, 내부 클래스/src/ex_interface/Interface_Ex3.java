package ex_interface;
	interface in1{
		int x = 10;
		void in1Method();
	}
	interface in2{
		int x = 20;
		void in1Method();
		void in2Method();
	}
	
	interface in3 extends in1, in2{
	}
	
	class ExtendsTest implements in3{

		@Override
		public void in1Method() {
			
		}

		@Override
		public void in2Method() {
			
		}
		
	}
public class Interface_Ex3 {

	/*
	 * 인터페이스 사이의 상속
	 * 작성일 : 1125
	 */
	public static void main(String[] args) {
		ExtendsTest et = new ExtendsTest();
		
		et.in1Method();
		et.in2Method();
		
		System.out.println(in1.x);
		System.out.println(in2.x);
	}

}
