package ex_object_Class;

	class Student5{
		String name;
		int number;
		public Student5(String name, int number) {
			super();
			this.name = name;
			this.number = number;
		}
	}


public class toStringTest1 {

	/*
		toString �޼ҵ� ��� ����
		- toString �޼ҵ� : Object Ŭ�������� �����Ǵ� �޼���� Ư�� ��ü�� ���ڿ��� �������ִ� �޼ҵ��̴�.
						 object Ŭ�������� �������ִ� toString()�޼ҵ��� �⺻���� ����� 'Ŭ�����̸�@�ؽ��ڵ� ��'
						 �� ���·� �̷������ �ؽ��ڵ�� �޸𸮿��� �ش� ��ü���� ���а����� ������ ���̴�.
		�ۼ���: 1130 
	
	*/
	
	public static void main(String[] args) {
		Student5 st1 = new Student5("�ڽø�", 1);
		Student5 st2 = new Student5("�ڵ���", 2);
		
		System.out.println("st1.toString()");
		System.out.println(st1);
		
		System.out.println("st2.toString()");
		System.out.println(st2);
	}
	// ��ü ������ �����ϰ� �ʹٸ� toString()�޼ҵ带 �������̵� ���ָ� �ȴ�.
}
