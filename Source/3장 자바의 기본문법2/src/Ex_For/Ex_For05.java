package Ex_For;

public class Ex_For05 {
	/*
	 * �Է¹��� ������ ���� 1������ ���� ���ϴ�  ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * for��
	 */
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		String exp = "";
		
		for(int i = num; i >= 1; i--) {
			sum += i;
			exp += (i==num)?"" + i: "+" +i;
			
		}
		System.out.println(exp + "=" + sum);
	}

}