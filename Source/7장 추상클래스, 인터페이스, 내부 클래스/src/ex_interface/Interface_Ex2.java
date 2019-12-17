package ex_interface;
	
	class Vehicle1 {
		void move() {
			System.out.println("움직임");
		}
	}
	
	interface Flyable{
		void fly();
	}
	
	class interface2impl extends Vehicle1 implements Flyable{

		@Override
		public void fly() {
			System.out.println("비행");
		}
		
	}

public class Interface_Ex2 {

	/*
	 * 클래스상속과 동시에 인터페이스 구현하기
	 * 작성일 : 1125
	 */
	public static void main(String[] args) {
		interface2impl in2impl = new interface2impl();
		in2impl.fly();
		in2impl.move();
	}

}
