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
	 	ordinal, values 메서드
	 	- ordinal : enum안에 정의되어있는 각 값들의 인덱스 번호를 변환해준다.
	 	- values : 해당 enum에 저장되어있는 값들은 해당 enum 타입의 배열로 반환해준다.
	 	작성일 : 1129
	 */
	public static void main(String[] args) {
		SchoolType1[] schools = SchoolType1.values();
		for(SchoolType1 school:schools) {
			System.out.println(school + ":" + school.ordinal());
		}
		
	}

}
