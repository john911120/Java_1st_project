package Method_Ex;

public class Args_Test {
	
	/*
	 * 인수 전달 방식 연습 예제2
	 * 작성일  : 1115
	 * 자바는 메소드에 인자를 전달할 때는 값이 복사되어서 전송된다.
	 */

	public static void main(String[] args) {
		Args arg = new Args();
		arg.x = 100;
		int[] arr = new int[1];
		
		arg.add(arg.x);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arg);
		System.out.println("arg.x = " + arg.x);
		
		arg.addNew(arg);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arr);
		System.out.println("arr[0] = " + arr[0]);
	}

}
