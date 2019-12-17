package ex_abstract;

	abstract class Vehicle{
		abstract void move();
	}
	class Car extends Vehicle{

		@Override
		void move() {
			System.out.println("������ �ٴѴ�.");
		}
	}
	class Ship extends Vehicle{

		@Override
		void move() {
			System.out.println("�ٴٷ� �ٴѴ�.");
		}
		
	}
	
	class Plane extends Vehicle{

		@Override
		void move() {
			System.out.println("�ϴ÷� �ٴѴ�.");
		}
	}
	class VehicleUse{
		void getMoveStyle(Vehicle vehicle) {
			vehicle.move();
		}
	}
	
public class Abstract_Test3 {
	
	/*
	 * �߻�Ŭ������ ������
	 * �ۼ��� : 1125
	 */
	public static void main(String[] args) {
		Car car = new Car();
		Ship ship = new Ship();
		Plane plane = new Plane();
		VehicleUse vUse = new VehicleUse();
		
		vUse.getMoveStyle(car);
		vUse.getMoveStyle(ship);
		vUse.getMoveStyle(plane);
	}
}
