package inheritance_Ex;

	/*
	 * ���� Ŭ������ ���� ȣ���ϱ�
	 * �ۼ��� : 1121
	 */
	class sawon3{
		String name = "�ڽø�";
	}
	
	class Sales3 extends sawon3{
		String name = "���ϴ�";
		String displayInfoLocal() {
			String name = "������";
			return name;
		}
		
		
		String displayinfoThis() {
			String name = "������";
			return this.name;
		}
		String displayinfoSuper() {
			String name = "��ó��";
			return super.name;
		}
	}

public class SuperVariableTest {
	/*
	 * super�� �̿��� ���� ȣ���׽�Ʈ
	 */
	public static void main(String[]args) {
		Sales3 sales3 = new Sales3();
		System.out.println("local.name =" + sales3.displayInfoLocal());
		System.out.println("local.name =" + sales3.displayinfoThis());
		System.out.println("local.name =" + sales3.displayinfoSuper());
	}
		
}
