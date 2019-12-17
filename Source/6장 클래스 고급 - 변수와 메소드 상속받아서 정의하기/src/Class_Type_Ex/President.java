package Class_Type_Ex;

/*
 * person클래스의 자식 클래스인 president 클래스 확정하기
 * 작성일 : 1124
 */

public class President extends Person {
	private int	salary;
	private String nation;
	private int getSalary() {
		return salary;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void showSleepstyle() {
		System.out.println("대통령은 수면시간이 항상 부족하다.");
	}
		
	
}
