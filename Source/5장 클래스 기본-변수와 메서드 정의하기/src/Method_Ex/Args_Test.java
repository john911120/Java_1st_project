package Method_Ex;

public class Args_Test {
	
	/*
	 * �μ� ���� ��� ���� ����2
	 * �ۼ���  : 1115
	 * �ڹٴ� �޼ҵ忡 ���ڸ� ������ ���� ���� ����Ǿ ���۵ȴ�.
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
