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
	 	enum�� �ʿ伺
	 	- school ���� ���� ���� ������ ���ϴ� �κ������� �ּ��� �����ϸ� ������ �߻��Ѵ�.
	 	- ���� ���� �̿��ؼ� ��ü�� �����ϴ� �κ������� �ּ��� �����ϸ� ������ �߻��Ѵ�.
	 	�ۼ��� : 1129
	 */
	public static void main(String[] args) {
		Student1 st1 = new Student1(SchoolType.ELEMENTARY);
		//Student st2 = new Student(2);
		
		System.out.println("��� ���� ����� ���");
		System.out.println("st1.school = " + st1.School);
		//System.out.println("st2.school = " + st2.School);
		
		if(st1.School == SchoolType.ELEMENTARY) {
			System.out.println("st1.school == Student.ELEMENTARY�� �� ���� ��");
			System.out.println("����� �ʵ��л��Դϴ�.");
		}
		/*if(st1.School == 1) {
			System.out.println("st1.school == 1 �� ������ ��");
			System.out.println("����� �ʵ��л��Դϴ�.");
		}
		*/
		
	}

}
