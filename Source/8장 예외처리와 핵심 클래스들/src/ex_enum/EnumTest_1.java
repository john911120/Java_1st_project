package ex_enum;

	class Student {
		int School;
		public Student(int school) {
			this.School = school;
		}
		public static int ELEMENTARY = 1;
		public static int MIDDLE = 2;
		public static int HIGH = 3;
		public static int UNIVERSITY = 4;
		public static int COLLEAGE = 5;
	}

public class EnumTest_1 {

	/*
	 	enum의 필요성(상수 사용)
	 	작성일 : 1129
	 */
	public static void main(String[] args) {
		Student st1 = new Student(Student.ELEMENTARY);
		Student st2 = new Student(2);
		
		System.out.println("상수 값을 출력한 경우");
		System.out.println("st1.school = " + st1.School);
		System.out.println("st2.school = " + st2.School);
		
		if(st1.School == Student.ELEMENTARY) {
			System.out.println("st1.school == Student.ELEMENTARY로 비교 했을 때");
			System.out.println("당신은 초등학생입니다.");
		}
		if(st1.School == 1) {
			System.out.println("st1.school == 1 로 비교했을 때");
			System.out.println("당신은 초등학생입니다.");
		}
		
	}

}
