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
		equals 메소드 재정의 사용 예제
		작성일: 1130 
	
	*/
	
	public static void main(String[] args) {
		Student4 st1 = new Student4("박시명", 1);
		Student4 st2 = new Student4("박시명", 1);
		
		System.out.println("== 으로 비교");
		System.out.println("st1 == st2:" + (st1 == st2));
		
		System.out.println("equals 으로 비교");
		System.out.println("st1.equals(st2):" + (st1.equals(st2)));
	}

}
