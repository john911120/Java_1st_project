package inheritance_Ex;

	/*
	 * super 용도 확인 예제
	 * 작성일 : 1121
	 */
	class sawon2{
		String name;
		String dept;
		int salary;
		
	public sawon2(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
		
		String displayinfo() {
			return "이름:" + name + ",부서:" + dept + ",연봉:" + salary;
		}
	}
	
	class Sales2 extends sawon2{
		int commition;
		
	public Sales2(String name, String dept, int salary, int commition) {
		super(name, dept, salary);
		this.commition = commition;
	}
		
		String displayinfo() {
			return super.displayinfo() + ",수당:" + commition;
		}
	}

public class SuperTest2 {
	/*
	 * 상속 테스트
	 */
	public static void main(String[]args) {
		Sales2 sales2 = new Sales2("시명이","개발부",3500000,650000);
		System.out.println(sales2.displayinfo());
	}
		
}
