package Ex_While;

public class Ex_While01 {
	/*
	 * 1���� 30������ ���� ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * while��
	 */
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 30) {
			sum += i;
			i++;
			
		}
		System.out.println("1���� 30������ ����" + sum + "�Դϴ�.");
	}

}
