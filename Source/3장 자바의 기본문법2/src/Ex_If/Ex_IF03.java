package Ex_If;

public class Ex_IF03 {
	/*
	 * �ش� ������ �������� �ƴ����� �Ǵ��ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * if else�� Ȱ�� ����
	 */
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		boolean isLeap = false;
		isLeap = (year%4==0 && year % 100 != 0 || year % 400 == 0);
		if(isLeap) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ������ �ƴմϴ�.");
		}
	}

}
