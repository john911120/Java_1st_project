package ex_abstract;

	abstract class Vehicle{
		abstract void move();
	}
	class Car extends Vehicle{

		@Override
		void move() {
			System.out.println("차도로 다닌다.");
		}
	}
	class Ship extends Vehicle{

		@Override
		void move() {
			System.out.println("바다로 다닌다.");
		}
		
	}
	
	class Plane extends Vehicle{

		@Override
		void move() {
			System.out.println("하늘로 다닌다.");
		}
	}
	class VehicleUse{
		void getMoveStyle(Vehicle vehicle) {
			vehicle.move();
		}
	}
	
public class Abstract_Test3 {
	
	/*
	 * 추상클래스의 다형성
	 * 작성일 : 1125
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
