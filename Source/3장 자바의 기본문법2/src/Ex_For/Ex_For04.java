package Ex_For;

public class Ex_For04 {
	/*
	 * 40���� 2�� ���ҽ�Ű�鼭  �հ踦 ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * for��
	 */
	public static void main(String[] args) {
		int sum = 0;
		String exp = "";
		
		for(int i = 40; i >= 1; i--) {
			sum += i;
			exp += (i==40)?"" + i: "+" + i;
			
		}
		System.out.println(exp + "=" + sum);
	}

}
