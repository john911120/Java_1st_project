package ex_enum;

	class Student2 {
		SchoolType1 School;
		public Student2(SchoolType1 school) {
			this.School = school;
		}
		
	}

	enum SchoolType1{
		ELEMENTARY,MIDDLE,HIGH,UNIVERSITY,COLLEAGE;
	}
public class EnumTest_3 {

	/*
	 	ordinal, values �޼���
	 	- ordinal : enum�ȿ� ���ǵǾ��ִ� �� ������ �ε��� ��ȣ�� ��ȯ���ش�.
	 	- values : �ش� enum�� ����Ǿ��ִ� ������ �ش� enum Ÿ���� �迭�� ��ȯ���ش�.
	 	�ۼ��� : 1129
	 */
	public static void main(String[] args) {
		SchoolType1[] schools = SchoolType1.values();
		for(SchoolType1 school:schools) {
			System.out.println(school + ":" + school.ordinal());
		}
		
	}

}
