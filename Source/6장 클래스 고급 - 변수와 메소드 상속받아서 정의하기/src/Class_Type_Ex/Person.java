package Class_Type_Ex;

/*
 * �θ� Ŭ������ person Ŭ���� �����ϱ�
 * �ۼ��� : 1124
 */

public class Person {
	private int age;
	private String name;
	private String addr;
	int x = 10;
	private int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void sleep() {
		System.out.println("����� ���� 10�ð� ��ϴ�.");
	}
	public void showSleepstyle() {
		System.out.println("������� ���� ��Ÿ���� �پ��ϴ�.");
	}
}
