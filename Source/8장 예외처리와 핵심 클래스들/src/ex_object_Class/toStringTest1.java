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
		toString 메소드 사용 예제
		- toString 메소드 : Object 클래스에서 제공되는 메서드로 특정 객체를 문자열로 변경해주는 메소드이다.
						 object 클래스에서 제공해주는 toString()메소드의 기본적인 기능은 '클래스이름@해쉬코드 값'
						 의 형태로 이루어지며 해쉬코드는 메모리에서 해당 객체들을 구분가능한 유일한 값이다.
		작성일: 1130 
	
	*/
	
	public static void main(String[] args) {
		Student5 st1 = new Student5("박시명", 1);
		Student5 st2 = new Student5("박두한", 2);
		
		System.out.println("st1.toString()");
		System.out.println(st1);
		
		System.out.println("st2.toString()");
		System.out.println(st2);
	}
	// 객체 정보를 리턴하고 싶다면 toString()메소드를 오버라이딩 해주면 된다.
}
