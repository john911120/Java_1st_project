package Ex_For;

public class Ex_For06 {
	/*
	 * ¦���� ���� ���ϴ� ����(1���� 30����)
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * for��
	 */
	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		for(int i = 1; i <= 30; i++) {
			if (i %2==0) {
				sum += i;
				exp += (i==2)?"" + i: "+" +i;
			}
		}
		System.out.println(exp + "=" + sum);
	}

}