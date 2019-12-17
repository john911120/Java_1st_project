package inheritance_Ex;

	/*
	 * super레퍼런스 변수 사용하는 예제
	 * 작성일 : 1121
	 */
	class sawon{
		String name;
		String dept;
		int salary;
		
		String displayinfo() {
			return "이름:" + name + ",부서:" + dept + ",연봉:" + salary;
		}
	}
	
	class Sales extends sawon{
		int commition;
		
		String displayinfo() {
			return super.displayinfo() + ",수당:" + commition;
		}
	}

public class SuperTest {
	/*
	 * 상속 테스트
	 */
	public static void main(String[]args) {
		Sales sales = new Sales();
		System.out.println(sales.displayinfo());
	}
		
}
