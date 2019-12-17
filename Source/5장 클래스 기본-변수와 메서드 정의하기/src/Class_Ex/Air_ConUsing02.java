package Class_Ex;

public class Air_ConUsing02 {

	/*
	 * 객체의 변수와 메서드 사용 테스트
	 * 작성일 : 1114
	 * 
	 */
	public static void main(String[] args) {
		Air_Con airCon1 = new Air_Con();
		
		// 변수 사용
		airCon1.color = "white";
		airCon1.temp = 10;
		airCon1.price = 1200000;

		//메서드 사용하기
		airCon1.tempUP();
		System.out.println("airCon1.temp = " + airCon1.temp + ",airCon1.color = " + airCon1.color
				+ ",airCon1.price = " + airCon1.price + "원");
		airCon1.powerOn();
		airCon1.powerOff();
		airCon1.tempDown();
		System.out.println("airCon1.temp = " + airCon1.temp + ",airCon1.color = " + airCon1.color
				+ ",airCon1.price = " + airCon1.price + "원");
		
		// 또 다른 객체 생성하기
		Air_Con airCon2 = new Air_Con();
		System.out.println("airCon2.temp = " + airCon2.temp + ",airCon2.color = " + airCon2.color
				+ ",airCon2.price = " + airCon2.price + "원");
		
		// airCon2 변수에 airCon1 변수 참조 값 할당하기
		airCon2 = airCon1;
		System.out.println("airCon2.temp = " + airCon2.temp + ",airCon2.color = " + airCon2.color
				+ ",airCon2.price = " + airCon2.price + "원");
	}

}
