package Ex_For;

public class Ex_For07 {
	/*
	 * ����For�� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * ���� for��
	 */
	public static void main(String[] args) {
		for(int outer = 1; outer<=3; outer++) {
			for(int inner = 1; inner<=3; inner++) {
				System.out.println("outer = " + outer + ",inner = " + inner);
			}
		}
	}

}
