package Variable_Ex;

public class Variable_Kind_EX00 {

	/*
	 * 변수의 종류 
	 * 작성일 : 1114
	 * 
	 */
		// instance member variable
			int memVar;
		// static member variable	
			static int staticVar;
			
	public static void main(String[] args) {
		// local Variable
		int localVar;
		
		Variable_Kind_EX00 vk1 = new Variable_Kind_EX00();
		System.out.println("vk1.memVar = " + vk1.memVar);
		System.out.println("vk1.staticVar = " + vk1.staticVar);
		System.out.println("Variable_Kind_EX00.staticVar = " + Variable_Kind_EX00.staticVar );
		System.out.println("staticVar = " + staticVar);
		Variable_Kind_EX00 vk2 = new Variable_Kind_EX00();
		vk1.staticVar = 20;
		System.out.println("vk2.staticVar = " + vk2.staticVar);
		
		// System.out.println("localVar = " + localVar);
	}

}
