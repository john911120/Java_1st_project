package inheritance_Ex;

	/*
	 * 상위 클래스의 변수 호출하기
	 * 작성일 : 1121
	 */
	class sawon3{
		String name = "박시명";
	}
	
	class Sales3 extends sawon3{
		String name = "두하니";
		String displayInfoLocal() {
			String name = "무오기";
			return name;
		}
		
		
		String displayinfoThis() {
			String name = "무오기";
			return this.name;
		}
		String displayinfoSuper() {
			String name = "영처리";
			return super.name;
		}
	}

public class SuperVariableTest {
	/*
	 * super를 이용한 변수 호출테스트
	 */
	public static void main(String[]args) {
		Sales3 sales3 = new Sales3();
		System.out.println("local.name =" + sales3.displayInfoLocal());
		System.out.println("local.name =" + sales3.displayinfoThis());
		System.out.println("local.name =" + sales3.displayinfoSuper());
	}
		
}
