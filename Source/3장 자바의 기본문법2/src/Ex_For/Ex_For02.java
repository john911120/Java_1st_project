package Ex_For;

public class Ex_For02 {
	/*
	 * 0���� 20������ �հ踦 �������� ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * for��
	 */
	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		for(int i = 0; i <= 20; i++) {
			sum += i;
			exp += (i==0)?"" + i: "+" +i;
			
		}
		System.out.println(exp + "=" + sum);
	}

}
