package Ex_For;

public class Ex_For03 {
	/*
	 * 2�� �����ؼ� 40������ �հ踦 �������� ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * for��
	 */
	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		for(int i = 0; i <= 40; i=i+2) {
			sum += i;
			exp += (i==0)?"" + i: "+" +i;
			
		}
		System.out.println(exp + "=" + sum);
	}

}