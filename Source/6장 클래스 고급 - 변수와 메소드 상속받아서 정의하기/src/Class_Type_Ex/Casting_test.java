package Class_Type_Ex;

public class Casting_test {
	/*
	 * casting 연습 클래스 정의
	 * 작성일 : 1124
	 */
	public static void main(String[] args) {
		President president1 = new President();
		
		/*
		 * president1 객체를 상위 클래스인 Person클래스 레퍼런스 변수에 참조
		 * president1 객체가 자동으로 person타입으로 upCasting 되면서 참조가 된다.
		 */
		Person person1 = president1;
		
		// person1 레퍼런스 변수의 참조 값을 president 타입의 레퍼런스 변수에 할당
		// 부모 클래스 타입의 참조 값을 자식 클래스 타입의 참조 변수에 할당하므로 명시적인 캐스팅이 된다.
		President president2 = (President)person1;
		
		// person객체 생성하기
		Person person2 = new Person();
		
		// person 객체를 President 타입의 레퍼런스 변수 참조
		President president3 = (President)person2;
		
		/*
		// 같은 부모 클래스를 상속 받는 클래스 타입 끼리 캐스팅
		// 동일한 부모 클래스를 상속 받아도 부모 자식 클래스 관계가 아니라면 아무 관련 없는 클래스이므로 상호 캐스팅 불가하다.
		Student student = (Student)president2;
		*/
	}

}
