package Class_Type_Ex;

/*
 * personŬ������ �ڽ� Ŭ������ president Ŭ���� Ȯ���ϱ�
 * �ۼ��� : 1124
 */

public class President extends Person {
	private int	salary;
	private String nation;
	private int getSalary() {
		return salary;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void showSleepstyle() {
		System.out.println("������� ����ð��� �׻� �����ϴ�.");
	}
		
	
}
