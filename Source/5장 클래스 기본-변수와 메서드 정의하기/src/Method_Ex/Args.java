package Method_Ex;

public class Args {
	/*
	 * �μ� ���� ��� ���� ����1
	 * �ۼ���  : 1115
	 * �ڹٴ� �޼ҵ忡 ���ڸ� ������ ���� ���� ����Ǿ ���۵ȴ�.
	 */
	int x;
	void add(int x) {
		x = x + 50;
	}
	
	void add(Args arg) {
		arg.x = arg.x + 40;
	}
	void addNew(Args arg) {
		arg = new Args();
	}
	void add(int[] arr) {
		arr[0]++;
	}
}

