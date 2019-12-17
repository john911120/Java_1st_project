package Class_Type_Ex;

/*
 * person을 상속받는 employee 클래스 정의하기
 * 작성일 : 1124
 */

public class Employee extends Person {
	private String department;
	int x = 20;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public void sleep() {
		System.out.println("직장인은 하루에 7시간을 일반적으로 잔다.");
	}
	@Override
	public void showSleepstyle() {
		System.out.println("직장인을 많은 업무때문에 수면이 부족한 편이다.");;
	}
}
