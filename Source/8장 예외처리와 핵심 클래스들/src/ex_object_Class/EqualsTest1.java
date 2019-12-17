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
		equals 메소드 사용 예제
		- equals 메소드 : object클래스에 정의 되어있으므로 모든 클래스에서 사용이 가능하다. 
						그러나 object에 정의되어있는 equals 메소드는 단순하게 == 역할만 하기 때문에
						객체 2개의 레퍼런스 값이 같다면 true, 다르면 false를 반환해준다.
		작성일: 1130 
	
	*/
	
	public static void main(String[] args) {
		Student3 st1 = new Student3("박시명", 1);
		Student3 st2 = new Student3("박시명", 1);
		
		System.out.println("== 으로 비교");
		System.out.println("st1 == st2:" + (st1 == st2));
		
		System.out.println("equals 으로 비교");
		System.out.println("st1.equals(st2):" + (st1.equals(st2)));
	}

}
