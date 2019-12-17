package Class_Ex;

	/*
	 * 클래스 변수 설정 예제
	 * 작성일 : 1114
	 * 자바 언어 프로그램의 최소 단위로 특정 객체를 어떻게 만들겠다는 것을
	 * 정의한 것이다. 집을 지을 때 설계도를 보고 집을 짓는 것과 같다.
	 */

public class Air_Con {
	// 변수 정의하기
	String company;
	String color;
	int price;
	int size;
	int temp;
	
	// 메소드 정의하기
	void powerOn() {
		System.out.println("power on");
	}
	void powerOff() {
		System.out.println("power off");
	}
	void tempUP() {
		temp++;
	}
	void tempDown() {
		temp--;
	}
}
