package Ex_Switch;

public class Ex_Switch01 {
	/*
	 * ���޺� ������ ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * switch��
	 */
	public static void main(String[] args) {
		String job = args[0];
		int salary = 0;
		switch(job) {
		case"���":
			salary = 2000000;
			break;
		case"�븮":
			salary = 2500000;
			break;
		case"����":
			salary = 3500000;
			break;
		case"����":
			salary = 4500000;
			break;
		}
		System.out.println("����� ������ " + salary + "�� �Դϴ�.");
		
	}

}
