package ex_object_Class;

	class Student6{
		String name;
		int number;
		public Student6(String name, int number) {
			super();
			this.name = name;
			this.number = number;
		}
		@Override
		public boolean equals(Object obj) {
			Student6 st = null;
			if(obj instanceof Student5) {
				st = (Student6)obj;
			}
			return(st != null && st.name.equals(name) && st.number == number);
			
		}
		@Override
		public String toString() {
			return "�̸�: " + name + ", ��ȣ: " + number;
			
		}
	}


public class toStringTest2 {

	/*
		Object�� toString() �������̵� ����
		- toString �޼ҵ� : Object Ŭ�������� �����Ǵ� �޼���� Ư�� ��ü�� ���ڿ��� �������ִ� �޼ҵ��̴�.
						 object Ŭ�������� �������ִ� toString()�޼ҵ��� �⺻���� ����� 'Ŭ�����̸�@�ؽ��ڵ� ��'
						 �� ���·� �̷������ �ؽ��ڵ�� �޸𸮿��� �ش� ��ü���� ���а����� ������ ���̴�.
		�ۼ���: 1130 
	
	*/
	
	public static void main(String[] args) {
		Student6 st1 = new Student6("�ڽø�", 1);
		Student6 st2 = new Student6("�ڵ���", 2);
		
		System.out.println("st1.toString()");
		System.out.println(st1);
		
		System.out.println("st2.toString()");
		System.out.println(st2);
	}
	// ��ü ������ �����ϰ� �ʹٸ� toString()�޼ҵ带 �������̵� ���ָ� �ȴ�.
}
