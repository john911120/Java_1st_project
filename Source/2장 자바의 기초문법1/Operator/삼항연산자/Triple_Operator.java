package ���׿�����;

public class Triple_Operator {
	/*
	 * 3�� ������ �׽�Ʈ ����
	 * �ۼ��� : 191102
	 */
	
	public static void main(String[] args) {
		/*
		 *  ���� �����ڴ� �ϳ��� ���ǿ� ���ؼ� ������ ���� �� �� ��ȯ�� ����
		 *  ������ �������� ���� �� ��ȯ�� ���� �����ϴ� �������̴�.
		 */

		int num = Integer.parseInt(args[0]);
		String msg = (num % 2 == 0)? "¦��":"Ȧ��";
		System.out.println(num + "��" + msg + "�Դϴ�.");
	}

}
