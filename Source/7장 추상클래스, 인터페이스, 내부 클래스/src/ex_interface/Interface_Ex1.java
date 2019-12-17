package ex_interface;
	
	interface interface1 {
		int interVar = 10;
		void Interface1Method();
	}
	
	class interface1impl implements interface1{

		@Override
		public void Interface1Method() {
			System.out.println("interface1Method 구현");
		}
		
	}

public class Interface_Ex1 {

	/*
	 * 인터페이스 사용
	 * 작성일 : 1125
	 */
	public static void main(String[] args) {
		//interface1 in1 = new interface1();
		
		interface1impl in1impl = new interface1impl();
		System.out.println("in1impl.interVar = " + in1impl.interVar);
		System.out.println("interface1.interVar = " + interface1.interVar);
		in1impl.Interface1Method();
	}

}
