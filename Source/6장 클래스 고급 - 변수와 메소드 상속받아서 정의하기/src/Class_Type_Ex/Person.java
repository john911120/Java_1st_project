package Class_Type_Ex;

/*
 * 부모 클래스인 person 클래스 정의하기
 * 작성일 : 1124
 */

public class Person {
	private int age;
	private String name;
	private String addr;
	int x = 10;
	private int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void sleep() {
		System.out.println("사람은 보통 10시간 잡니다.");
	}
	public void showSleepstyle() {
		System.out.println("사람들의 수면 스타일은 다양하다.");
	}
}
