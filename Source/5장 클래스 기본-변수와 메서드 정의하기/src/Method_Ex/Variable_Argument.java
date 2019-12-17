package Method_Ex;

public class Variable_Argument {
	
	/*
	 * 인수 전달 방식 연습 예제3
	 * 작성일  : 1115
	 * 자바는 메소드에 인자를 전달할 때는 값이 복사되어서 전송된다.
	 */
	void printInfo(String ...infos) {
		if(infos.length != 0) {
			for(int i = 0; i<infos.length; i++) {
				System.out.println(infos[i]);
			}
		}
		else {
			System.out.println("인자가 읎어요");
		}
	}
	
	public static void main(String[] args) {
		Variable_Argument vt = new Variable_Argument();
		System.out.println("인자 읎이");
		vt.printInfo();
		System.out.println("인자 1");
		vt.printInfo("으사양반");
		System.out.println("인자 2");
		vt.printInfo("으사양반","중환자실");
		System.out.println("인자 3");
		vt.printInfo("으사양반","중환자실","시명이");
	}

}
