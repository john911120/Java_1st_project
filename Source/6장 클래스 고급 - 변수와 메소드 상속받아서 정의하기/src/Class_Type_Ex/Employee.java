package Class_Type_Ex;

/*
 * person�� ��ӹ޴� employee Ŭ���� �����ϱ�
 * �ۼ��� : 1124
 */

public class Employee extends Person {
	private String department;
	int x = 20;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public void sleep() {
		System.out.println("�������� �Ϸ翡 7�ð��� �Ϲ������� �ܴ�.");
	}
	@Override
	public void showSleepstyle() {
		System.out.println("�������� ���� ���������� ������ ������ ���̴�.");;
	}
}
