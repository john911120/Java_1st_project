package Class_Type_Ex;

	class PersonInfo {
		void showsleepingType(Person person) {
			person.showSleepstyle();
		}
	}
	
public class Parameter_polyTest {

	/*
	 * 다형성 테스트를 위한 클래스 정의하기
	 * 작성일 : 1124
	 * 
	 */
	
	public static void main(String[] args) {
		PersonInfo pf = new PersonInfo();
		Person person = new Person();
		Employee employee = new Employee();
		Student student = new Student();
		President president = new President();
		
		pf.showsleepingType(person);
		pf.showsleepingType(employee);
		pf.showsleepingType(student);
		pf.showsleepingType(president);
	}

}
