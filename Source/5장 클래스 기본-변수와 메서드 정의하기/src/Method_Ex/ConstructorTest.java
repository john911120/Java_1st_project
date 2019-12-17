package Method_Ex;

/*
 * 생성자 예제
 * 작성일  : 1118
 * new 연산자에 의해서 객체를 생성할 때 단 한번만 호출되는 메소드이다.
 */
class Person{
		int age;
		String name;
		int height;
		int weight;
		public Person() {
			
		}
		
		public Person(int age) {
			this.age = age;
		}
	
		public Person(String name) {
			this.name = name;
		}
	}
public class ConstructorTest {
		
	/*
	 * 생성자 테스트
	 */
	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println("Person1.name =" + person1.name + ", Person1.height = " + person1.height + ", Person1.weight = " + person1.weight +
				", Person1.age = " + person1.age);
		
		Person person2 = new Person(30);
		System.out.println("Person2.name =" + person2.name + ", Person2.height = " + person2.height + ", Person2.weight = " + person2.weight +
				",Person2.age = " + person2.age);
		
		Person person3 = new Person("goodman");
		System.out.println("Person3.name =" + person3.name + ", Person3.height = " + person3.height + ",Person3.weight = " + person3.weight +
				",Person1.age = " + person3.age);
	}

}
