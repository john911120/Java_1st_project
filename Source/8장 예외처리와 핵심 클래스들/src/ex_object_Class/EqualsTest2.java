package ex_object_Class;

	class Student4{
		String name;
		int number;
		public Student4(String name, int number) {
			super();
			this.name = name;
			this.number = number;
		}
		@Override
		public boolean equals(Object obj) {
			Student4 st = null;
			if(obj instanceof Student4) {
				st = (Student4)obj;
			}
			
			return (st != null && st.name.equals(name) && st.number == number);
			
		}
	}


public class EqualsTest2 {

	/*
		equals �޼ҵ� ������ ��� ����
		�ۼ���: 1130 
	
	*/
	
	public static void main(String[] args) {
		Student4 st1 = new Student4("�ڽø�", 1);
		Student4 st2 = new Student4("�ڽø�", 1);
		
		System.out.println("== ���� ��");
		System.out.println("st1 == st2:" + (st1 == st2));
		
		System.out.println("equals ���� ��");
		System.out.println("st1.equals(st2):" + (st1.equals(st2)));
	}

}
