package Method_Ex;

public class OverloadingTest {
	
	/*
	 * �μ� ���� ��� ���� ����4
	 * �ۼ���  : 1115
	 * ���� �̸��� �޼ҵ带 �� Ŭ������ ������ ���� �� �� �ִ� ����� �ǹ��Ѵ�. ���⼭ ���Ѿ��� ��Ģ�� 3��
	 * 1. �Ķ������ Ÿ���̳� ������ �޶���Ѵ�.
	 * 2. �Ķ������ �̸��� �����ε� ������ ������ ������ �ʴ´�.
	 * 3. ���� Ÿ���� �����ε� ������ ������ ���� �ʴ´�.
	 */
	
	public static void main(String[] args) {
		Boiler bo = new Boiler();
		System.out.println("���� �µ� = " + bo.temp);
		bo.tempUP();
		System.out.println("bo.tempUP() �޼ҵ� ȣ�� �� ���� �µ� =" + bo.temp);
		bo.tempUp(20);
		System.out.println("bo.tempUp() �޼ҵ� ȣ�� �� ���� �µ� = " + bo.temp);
	}

}
