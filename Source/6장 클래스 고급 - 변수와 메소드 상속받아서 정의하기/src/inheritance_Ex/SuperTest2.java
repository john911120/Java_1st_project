package inheritance_Ex;

	/*
	 * super �뵵 Ȯ�� ����
	 * �ۼ��� : 1121
	 */
	class sawon2{
		String name;
		String dept;
		int salary;
		
	public sawon2(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
		
		String displayinfo() {
			return "�̸�:" + name + ",�μ�:" + dept + ",����:" + salary;
		}
	}
	
	class Sales2 extends sawon2{
		int commition;
		
	public Sales2(String name, String dept, int salary, int commition) {
		super(name, dept, salary);
		this.commition = commition;
	}
		
		String displayinfo() {
			return super.displayinfo() + ",����:" + commition;
		}
	}

public class SuperTest2 {
	/*
	 * ��� �׽�Ʈ
	 */
	public static void main(String[]args) {
		Sales2 sales2 = new Sales2("�ø���","���ߺ�",3500000,650000);
		System.out.println(sales2.displayinfo());
	}
		
}
