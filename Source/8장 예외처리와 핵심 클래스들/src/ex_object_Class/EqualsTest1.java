package ex_object_Class;

	class Student3{
		String name;
		int number;
		public Student3(String name, int number) {
			super();
			this.name = name;
			this.number = number;
		}
	}


public class EqualsTest1 {

	/*
		equals �޼ҵ� ��� ����
		- equals �޼ҵ� : objectŬ������ ���� �Ǿ������Ƿ� ��� Ŭ�������� ����� �����ϴ�. 
						�׷��� object�� ���ǵǾ��ִ� equals �޼ҵ�� �ܼ��ϰ� == ���Ҹ� �ϱ� ������
						��ü 2���� ���۷��� ���� ���ٸ� true, �ٸ��� false�� ��ȯ���ش�.
		�ۼ���: 1130 
	
	*/
	
	public static void main(String[] args) {
		Student3 st1 = new Student3("�ڽø�", 1);
		Student3 st2 = new Student3("�ڽø�", 1);
		
		System.out.println("== ���� ��");
		System.out.println("st1 == st2:" + (st1 == st2));
		
		System.out.println("equals ���� ��");
		System.out.println("st1.equals(st2):" + (st1.equals(st2)));
	}

}
