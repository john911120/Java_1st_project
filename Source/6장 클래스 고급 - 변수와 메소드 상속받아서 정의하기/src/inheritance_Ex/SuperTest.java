package inheritance_Ex;

	/*
	 * super���۷��� ���� ����ϴ� ����
	 * �ۼ��� : 1121
	 */
	class sawon{
		String name;
		String dept;
		int salary;
		
		String displayinfo() {
			return "�̸�:" + name + ",�μ�:" + dept + ",����:" + salary;
		}
	}
	
	class Sales extends sawon{
		int commition;
		
		String displayinfo() {
			return super.displayinfo() + ",����:" + commition;
		}
	}

public class SuperTest {
	/*
	 * ��� �׽�Ʈ
	 */
	public static void main(String[]args) {
		Sales sales = new Sales();
		System.out.println(sales.displayinfo());
	}
		
}
