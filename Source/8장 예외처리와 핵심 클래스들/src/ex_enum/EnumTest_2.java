package ex_enum;

	class Student1 {
		SchoolType School;
		public Student1(SchoolType school) {
			this.School = school;
		}
		
	}

	enum SchoolType{
		ELEMENTARY,MIDDLE,HIGH,UNIVERSITY,COLLEAGE;
	}
public class EnumTest_2 {

	/*
	 	enum의 필요성
	 	- school 변수 값을 정수 값으로 비교하는 부분이지만 주석을 제거하면 에러가 발생한다.
	 	- 정수 값을 이용해서 객체를 생성하는 부분이지만 주석을 제거하면 에러가 발생한다.
	 	작성일 : 1129
	 */
	public static void main(String[] args) {
		Student1 st1 = new Student1(SchoolType.ELEMENTARY);
		//Student st2 = new Student(2);
		
		System.out.println("상수 값을 출력한 경우");
		System.out.println("st1.school = " + st1.School);
		//System.out.println("st2.school = " + st2.School);
		
		if(st1.School == SchoolType.ELEMENTARY) {
			System.out.println("st1.school == Student.ELEMENTARY로 비교 했을 때");
			System.out.println("당신은 초등학생입니다.");
		}
		/*if(st1.School == 1) {
			System.out.println("st1.school == 1 로 비교했을 때");
			System.out.println("당신은 초등학생입니다.");
		}
		*/
		
	}

}
