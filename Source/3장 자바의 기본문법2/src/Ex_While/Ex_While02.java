package Ex_While;

public class Ex_While02 {
	/*
	 * 1���� 30������ ���� ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * while��
	 */
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (true) {
			sum += i;
			i++;
			if(i==30)break;
			
		}
		System.out.println("1���� 30������ ����" + sum + "�Դϴ�.");
	}

}
