package Class_Ex;

	/*
	 * Ŭ���� ���� ���� ����
	 * �ۼ��� : 1114
	 * �ڹ� ��� ���α׷��� �ּ� ������ Ư�� ��ü�� ��� ����ڴٴ� ����
	 * ������ ���̴�. ���� ���� �� ���赵�� ���� ���� ���� �Ͱ� ����.
	 */

public class Air_Con {
	// ���� �����ϱ�
	String company;
	String color;
	int price;
	int size;
	int temp;
	
	// �޼ҵ� �����ϱ�
	void powerOn() {
		System.out.println("power on");
	}
	void powerOff() {
		System.out.println("power off");
	}
	void tempUP() {
		temp++;
	}
	void tempDown() {
		temp--;
	}
}
