package Class_Type_Ex;

/*
 * Overriding Test
 * ¿€º∫¿œ : 1124
 */

public class Overriding_Test {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Person person = employee;
		
		System.out.println("employee.x = " + employee.x);
		System.out.println("person.x = " + person.x);
		
		employee.sleep();
		person.sleep();
	}

}
