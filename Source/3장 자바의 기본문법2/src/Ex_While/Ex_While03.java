package Ex_While;

public class Ex_While03 {
	/*
	 * �������� ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * while��2
	 */
	public static void main(String[] args) {
		int danNumber = Integer.parseInt(args[0]);
		if(danNumber >= 2 && danNumber <=9) {
			int num = 1;
			int result = 0;
			while(num <= 9) {
				result = danNumber * num;
				System.out.println(danNumber + "*" + num + "=" + result);
				num ++;
			}
		}
		else {
		System.out.println("�� ���� �߸��ԷµǾ����ϴ�.");
		}
	}
}
