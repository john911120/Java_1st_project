package ex_interface;
	
	class Vehicle1 {
		void move() {
			System.out.println("������");
		}
	}
	
	interface Flyable{
		void fly();
	}
	
	class interface2impl extends Vehicle1 implements Flyable{

		@Override
		public void fly() {
			System.out.println("����");
		}
		
	}

public class Interface_Ex2 {

	/*
	 * Ŭ������Ӱ� ���ÿ� �������̽� �����ϱ�
	 * �ۼ��� : 1125
	 */
	public static void main(String[] args) {
		interface2impl in2impl = new interface2impl();
		in2impl.fly();
		in2impl.move();
	}

}
