package Ex_Switch;

public class Ex_Switch02 {
	/*
	 * ���޺� ������ ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * switch��(break ����� ���� Ver.)
	 */
	public static void main(String[] args) {
		String job = args[0];
		int salary = 0;
		switch(job) {
		case"���":
			salary = 2000000;
		case"�븮":
			salary = 2500000;
		case"����":
			salary = 3500000;
		case"����":
			salary = 4500000;
		}
		System.out.println("����� ������ " + salary + "�� �Դϴ�.");
		
	}

}
